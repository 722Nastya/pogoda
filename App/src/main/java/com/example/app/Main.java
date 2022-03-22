package com.example.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 560, 240);
        stage.setTitle("Weather-wear");
        stage.setScene(scene);
        stage.show();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view"));

    }

    public static void main(String[] args) {
        
        launch();
    }
}