package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import model.Intersection;

import java.util.List;

public class SimulationController {
    private List<Intersection> intersections;

    public SimulationController(List<Intersection> intersections) {
        this.intersections = intersections;
    }

    public void startSimulation() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), e -> {
            for (Intersection intersection : intersections) {
                intersection.updateLights();
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
