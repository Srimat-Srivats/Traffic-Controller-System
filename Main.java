package main;

import javafx.application.Application;
import javafx.stage.Stage;
import view.TrafficSimulatorUI;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        TrafficSimulatorUI ui = new TrafficSimulatorUI();
        ui.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
