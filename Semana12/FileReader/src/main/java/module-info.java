module com.example.filereader {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.filereader to javafx.fxml;
    exports com.example.filereader;
    exports com.example.filereader.model;
    opens com.example.filereader.model to javafx.fxml;
    exports com.example.filereader.controller;
    opens com.example.filereader.controller to javafx.fxml;
}