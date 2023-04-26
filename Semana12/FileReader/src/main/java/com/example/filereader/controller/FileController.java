package com.example.filereader.controller;

import com.example.filereader.model.FileManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FileController {

    // conponentes graficos
    @FXML
    private Button fileOpenBtn;

    @FXML
    private TextArea fileViewTA;
    private final FileManager fileManager = FileManager.getInstance();

    @FXML
    public void onFileView(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();

        Stage stage = (Stage) fileOpenBtn.getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);
        String path = file.getAbsolutePath();
        String content = fileManager.readFile(path);
        fileViewTA.setText(content);

    }


}