package view;

import controller.SimulationController;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import model.Intersection;
import model.TrafficLight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrafficSimulatorUI {
    private List<Intersection> intersections;
    private List<List<Circle>> trafficLightCircles = new ArrayList<>();

    public void start(Stage stage) {
        intersections = generateSampleIntersections();
        GridPane grid = new GridPane();

        for (int i = 0; i < intersections.size(); i++) {
            Intersection intersection = intersections.get(i);
            Label label = new Label("Intersection: " + intersection.getId());
            grid.add(label, 0, i * 2);
            List<Circle> circles = new ArrayList<>();

            for (int j = 0; j < intersection.getTrafficLights().size(); j++) {
                Circle light = new Circle(10);
                light.setFill(Color.RED);
                grid.add(light, j + 1, i * 2);
                circles.add(light);
            }
            trafficLightCircles.add(circles);
        }

        SimulationController controller = new SimulationController(intersections) {
            @Override
            public void startSimulation() {
                javafx.animation.Timeline timeline = new javafx.animation.Timeline(
                    new javafx.animation.KeyFrame(javafx.util.Duration.seconds(2), e -> {
                        for (int i = 0; i < intersections.size(); i++) {
                            intersections.get(i).updateLights();
                            List<TrafficLight> lights = intersections.get(i).getTrafficLights();
                            for (int j = 0; j < lights.size(); j++) {
                                TrafficLight.State state = lights.get(j).getCurrentState();
                                Circle circle = trafficLightCircles.get(i).get(j);
                                switch (state) {
                                    case RED: circle.setFill(Color.RED); break;
                                    case GREEN: circle.setFill(Color.GREEN); break;
                                    case YELLOW: circle.setFill(Color.YELLOW); break;
                                }
                            }
                        }
                    })
                );
                timeline.setCycleCount(javafx.animation.Timeline.INDEFINITE);
                timeline.play();
            }
        };

        controller.startSimulation();

        Scene scene = new Scene(grid, 600, 400);
        stage.setTitle("Traffic Controller");
        stage.setScene(scene);
        stage.show();
    }

    private List<Intersection> generateSampleIntersections() {
        List<TrafficLight> lights1 = Arrays.asList(new TrafficLight(), new TrafficLight());
        List<TrafficLight> lights2 = Arrays.asList(new TrafficLight(), new TrafficLight(), new TrafficLight());
        Intersection i1 = new Intersection("A", lights1);
        Intersection i2 = new Intersection("B", lights2);
        return new ArrayList<>(Arrays.asList(i1, i2));
    }
}
