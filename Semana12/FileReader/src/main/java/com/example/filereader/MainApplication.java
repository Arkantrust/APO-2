package com.example.filereader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        renderView("init-view.fxml");
    }

    public static void renderView(String fxml){
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(
                    MainApplication.class.getResource(fxml)
            );
            Parent parent = fxmlLoader.load();
            Scene scene = new Scene(parent, 320, 240);
            Stage stage = new Stage();
            stage.setTitle("File App");
            stage.setScene(scene);
            stage.show();

        }catch (IOException ex){
            ex.getMessage();
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}