package com.example.extraclase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("table.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1136, 700);
        stage.setTitle("Table");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Lector lector_csv = new Lector();
        lector_csv.leerArchivo("C:\\Users\\Adrian\\Desktop\\TEC\\II Semestre\\Algoritmos y Estructuras de Datos\\Students_csv.csv");
        launch();
    }
}

