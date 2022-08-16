package com.example.extraclase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Lector lectos_csv = new Lector();
        lectos_csv.leerArchivo("C:\\Users\\Adrian\\Desktop\\TEC\\II Semestre\\Algoritmos y Estructuras de Datos\\Students_csv.csv");
        prb sebas = new prb();
        System.out.println(sebas.lak);

        /*List myList = new ArrayList();
        String carnet = "578";
        myList.add(carnet);
        myList.add("juan");
        myList.add(5);
        //Student est1 = new Student("2022", "marco");
        //Student_1 est2 = new Student_1("2044","maria",6);
        Student est3 = new Student(myList);
        System.out.println(myList);
        est3.imprimir();*/

        launch();

    }
}