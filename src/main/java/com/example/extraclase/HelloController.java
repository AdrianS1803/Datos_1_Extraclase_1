package com.example.extraclase;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;


//formato extraido de https://www.youtube.com/watch?v=A5fQbsJ-iF8
public class HelloController implements Initializable {

    @FXML
    private TableView<Student> table;
    @FXML
    private TableColumn<Student, String> carne;

    @FXML
    private TableColumn<Student, String> name;

    @FXML
    private TableColumn<Student, String> mail;

    @FXML
    private TableColumn<Student, Integer> phone;

    @FXML
    private TableColumn<Student, String> nombre_usuario;

    @FXML
    private TableColumn<Student, String> type;

    @FXML
    private TableColumn<Student, Integer> exam;

    @FXML
    private TableColumn<Student, Integer> quiz;

    @FXML
    private TableColumn<Student, Integer> homework;

    @FXML
    private TableColumn<Student, Integer> project_1;

    @FXML
    private TableColumn<Student, Integer> project_2;

    @FXML
    private TableColumn<Student, Integer> project_3;

    @FXML
    private TableColumn<Student, Integer> promedio;

    @FXML
    private TableColumn<Student_1, Integer> ex_qu_ta;

    @FXML
    private TableColumn<Student_2, Integer> preojects;

    @FXML
    private TableColumn<Student, Integer> final_grade;


    @FXML
    private Label welcomeText;
    @FXML
    private Label prueba;

    private ObservableList<Student> list = FXCollections.observableArrayList();

    public void correr(){
        Lector lector_csv = new Lector();
        lector_csv.leerArchivo("C:\\Users\\Adrian\\Desktop\\TEC\\II Semestre\\Algoritmos y Estructuras de Datos\\Students_csv.csv");

        //System.out.println(lector_csv.datos());Es este metedo el que no funciona


        /*Student estudiante = new Student("21315",/*(String) lector_csv.datos().get(0), (String) lector_csv.datos().get(1), (String) lector_csv.datos().get(2), (Integer) lector_csv.datos().get(3),
                (Integer) lector_csv.datos().get(4), (String) lector_csv.datos().get(5),
                (Integer) lector_csv.datos().get(6),lector_csv.datos().get(7),lector_csv.datos().get(8),
                lector_csv.datos().get(9),lector_csv.datos().get(10),lector_csv.datos().get(11));
        new Student("2022464612","Joshua Beltran Delgado", "joshbel@estudiantec.cr",87923666, "joshbel","2",
                100,100,100,
                100,100,100);*/
        //list.add(estudiante);
    }










    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        correr();
        carne.setCellValueFactory(new PropertyValueFactory<Student,String>("carne"));

        table.setItems(list);

    }




    }
