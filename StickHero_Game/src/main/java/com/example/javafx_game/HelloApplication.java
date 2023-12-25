package com.example.javafx_game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Scene mainScene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("start.fxml"));
//        Parent root = fxmlLoader.load();
//        SceneController controller = fxmlLoader.getController();
        Scene scene = new Scene(fxmlLoader.load(), 500, 374);
        mainScene = scene;
        stage.setTitle("Stick Hero");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
