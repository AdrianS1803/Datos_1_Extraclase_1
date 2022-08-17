package com.example.extraclase;



import java.io. BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Lector {
    private BufferedReader lector;// Lee el archivo
    private String linea;// recibe la linea de cada fila
    private String partes[] = null;// almacena cada linea leida

    private List<Student> lista_estudiante=new ArrayList<>();

    public void leerArchivo(String nombreArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                create_student(Integer.parseInt (partes[5]));
            }
            //Lector.close();
            linea = null;
            partes = null;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void create_student(int type){
        Student estudiante;

        if(type==1){
            estudiante = new Student_1(partes[0],partes[1],partes[2],Integer.parseInt (partes[3]),partes[4],partes[5],
                    Integer.parseInt (partes[6]),Integer.parseInt (partes[7]),Integer.parseInt (partes[8]),
                    Integer.parseInt (partes[9]),Integer.parseInt (partes[10]),Integer.parseInt (partes[11]),0);

        }else{
            estudiante = new Student_2(partes[0],partes[1],partes[2],Integer.parseInt (partes[3]),partes[4],partes[5],
                    Integer.parseInt (partes[6]),Integer.parseInt (partes[7]),Integer.parseInt (partes[8]),
                    Integer.parseInt (partes[9]),Integer.parseInt (partes[10]),Integer.parseInt (partes[11]),0);
        }
        estudiante.getNota_promedio_examenes();
        lista_estudiante.add(estudiante);
        estudiante.imprimir();
    }

    public List<Student> getLista_estudiante() {
        return lista_estudiante;
    }
}
