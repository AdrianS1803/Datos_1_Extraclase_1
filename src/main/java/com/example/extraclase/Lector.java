package com.example.extraclase;

import java.io. BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Lector {

    private BufferedReader lector; // lee el csv
    private String linea;// recibe la linea de cada fila
    private String partes[] = null;// almacena cada linea leída
    private List<Student> lista_estudiante = new ArrayList<>(); //guarda los estudiantes creados
    private int contador; // contador de cuantos estudiantes hay en el csv

    //Idea para el lector extraída de https://www.youtube.com/watch?v=uwn-Zkttux4
    public void leerArchivo(String nombreArchivo) {

        try {
            lector = new BufferedReader(new FileReader(nombreArchivo)); // crea un bufferreader que recibe el csv
            while ((linea = lector.readLine()) != null) { //para hasta que no haya nada que leer
                partes = linea.split(","); //lo leído lo parte cada ¨,¨ y lo guarda en partes
                contador = contador + 1; //aumenta el contador

                Student estudiante = create_student(Integer.parseInt(partes[5]));//crea un nuevo estdudiante con el metedo create_student
                lista_estudiante.add(estudiante); //añade el estudiante a la lista

            }

        } catch (Exception e) {
            System.out.println(e);// si da error que muestre en la consola el error
        }
    }

    public Student create_student(int type) {//crea un estudiante tomando como parametro el si es tipa 1 o 2

        if (type == 1) {
            Student_1 estudiante_1 = new Student_1(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), partes[4], partes[5],
                    Integer.parseInt(partes[6]), Integer.parseInt(partes[7]), Integer.parseInt(partes[8]),
                    Integer.parseInt(partes[9]), Integer.parseInt(partes[10]), Integer.parseInt(partes[11]));// crea un estudiante de tipo 1
            // uso de instantacion, pues cada estudiante creado es diferente

            return estudiante_1;// retorna el estudiante

        } else {
            Student_2 estudiante_2 = new Student_2(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), partes[4], partes[5],
                    Integer.parseInt(partes[6]), Integer.parseInt(partes[7]), Integer.parseInt(partes[8]),
                    Integer.parseInt(partes[9]), Integer.parseInt(partes[10]), Integer.parseInt(partes[11])); // crea un estudiante de tipo 2

            return estudiante_2;// retorna el estudiante
        }
    }
    public List getLista_estudiantes() {
        return lista_estudiante;
    } // permite acceder a la lista de estudiantes
    public int getContador() {return contador;} // permite obtener el valor del contador
}
