package com.example.filereader.controller;

import com.example.filereader.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class InitController {

    @FXML
    public void onOpenFileWindow(ActionEvent event) {
        MainApplication.renderView("file-view.fxml");
    }
}
