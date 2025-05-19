package com.example.lawnmowerdashboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Launching UI...");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/dashboard.fxml"));
        Scene scene = new Scene(loader.load(), 400, 300);
        stage.setScene(scene);
        stage.setTitle("Lawn Mower Dashboard");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
