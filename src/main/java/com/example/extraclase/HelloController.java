package com.example.extraclase  ;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

//formato extraido de https://www.youtube.com/watch?v=A5fQbsJ-iF8
public class HelloController implements Initializable { //controla lo que pasa en el escenario

    //Son las tablas del escenario------------------
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
    private TableColumn<Student_1, Float> ex_qu_ta;

    @FXML
    private TableColumn<Student_2, Float> projects;

    @FXML
    private TableColumn<Student, Integer> final_grade;
    //-----------------------------------------------------------------------

    private ObservableList<Student> list = FXCollections.observableArrayList();//Es las lista que se usa para assiganar los valores a las casillas de las tablas, contiene a los estudiantes

    public void add_student() {

        Lector lector_csv = new Lector();//crea un objeto Lector
        lector_csv.leerArchivo("C:\\Users\\Adrian\\Desktop\\TEC\\II Semestre\\Algoritmos y Estructuras de Datos\\Students_csv.csv");//le pasa el archivo a leer al lector

        for (int i=0;i<lector_csv.getContador();i++) //que se por la extencion del csv
            list.add((Student) lector_csv.getLista_estudiantes().get(i));//pasa los estdianres creados en la clase Lector
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        add_student();// llama add_student

        //Asigana los valores de los atributos de los estudiantes a la celdas--------------
        carne.setCellValueFactory(new PropertyValueFactory<Student,String>("carne"));
        name.setCellValueFactory(new PropertyValueFactory<Student,String>("nombre_apellido"));
        mail.setCellValueFactory(new PropertyValueFactory<Student,String>("correo"));
        phone.setCellValueFactory(new PropertyValueFactory<Student, Integer>("numero"));
        nombre_usuario.setCellValueFactory(new PropertyValueFactory<Student,String>("nickname"));
        type.setCellValueFactory(new PropertyValueFactory<Student,String>("tipo_student"));
        exam.setCellValueFactory(new PropertyValueFactory<Student,Integer>("nota_promedio_examenes"));
        quiz.setCellValueFactory(new PropertyValueFactory<Student,Integer>("nota_promedio_quices"));
        homework.setCellValueFactory(new PropertyValueFactory<Student,Integer>("nota_promedio_tareas"));
        project_1.setCellValueFactory(new PropertyValueFactory<Student,Integer>("nota_proyecto_1"));
        project_2.setCellValueFactory(new PropertyValueFactory<Student,Integer>("nota_proyecto_2"));
        project_3.setCellValueFactory(new PropertyValueFactory<Student,Integer>("nota_proyecto_3"));

        ex_qu_ta.setCellValueFactory(new PropertyValueFactory<Student_1,Float>("nota_promedio_ex_qu_ta"));
        projects.setCellValueFactory(new PropertyValueFactory<Student_2,Float>("nota_promedio_proyecto"));

        final_grade.setCellValueFactory(new PropertyValueFactory<Student,Integer>("promedio"));
        table.setItems(list);
        //---------------------------------------------------------------------------------------------------------------------
    }
    }
