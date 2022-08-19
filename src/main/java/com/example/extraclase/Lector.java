package com.example.extraclase;



import java.io. BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lector {
    private BufferedReader lector;// Lee el archivo
    private String linea;// recibe la linea de cada fila
    private String partes[] = null;// almacena cada linea leida
    private List<Student> lista_estudiante=new ArrayList<>();

    //Idea para el lector extraida de https://www.youtube.com/watch?v=uwn-Zkttux4
    public void leerArchivo(String nombreArchivo) {

        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");

                Student estudiante= create_student(Integer.parseInt (partes[5]));
                lista_estudiante.add(estudiante);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Student create_student(int type){

        if(type==1){
            Student_1 estudiante_1 = new Student_1(partes[0],partes[1],partes[2],Integer.parseInt (partes[3]),partes[4],partes[5],
                    Integer.parseInt (partes[6]),Integer.parseInt (partes[7]),Integer.parseInt (partes[8]),
                    Integer.parseInt (partes[9]),Integer.parseInt (partes[10]),Integer.parseInt (partes[11]));

            return estudiante_1;

        }else{
            Student_2 estudiante_2 = new Student_2(partes[0],partes[1],partes[2],Integer.parseInt (partes[3]),partes[4],partes[5],
                    Integer.parseInt (partes[6]),Integer.parseInt (partes[7]),Integer.parseInt (partes[8]),
                    Integer.parseInt (partes[9]),Integer.parseInt (partes[10]),Integer.parseInt (partes[11]));

            return estudiante_2;
        }
    }


    public List getLista_estudiantes() {
        return lista_estudiante;
    }
}
