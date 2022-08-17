package com.example.extraclase;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label prueba;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

        Lector lector_csv = new Lector();
        lector_csv.leerArchivo("C:\\Users\\Adrian\\Desktop\\TEC\\II Semestre\\Algoritmos y Estructuras de Datos\\Students_csv.csv");
        prueba.setText(lector_csv.getLista_estudiante().get(0).getCarne()); //No se porque no ve que tipo de estudiante es


    }
}