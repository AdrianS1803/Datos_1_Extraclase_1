package com.example.extraclase;

public class Student_1 extends Student {

    private int nota_promedio;


    public Student_1(String carne, String nombre_apellido, String correo, int numero, String nickname, String tipo_student,
                     int nota_promedio_examenes, int nota_promedio_quices, int nota_promedio_tareas,
                     int nota_proyecto_1, int nota_proyecto_2, int nota_proyecto_3, int nota_promedio){

        super(carne,nombre_apellido,correo,numero,nickname,tipo_student,
                nota_promedio_examenes,nota_promedio_quices,nota_promedio_tareas,
                nota_proyecto_1,nota_proyecto_2,nota_proyecto_3);

        this.nota_promedio=nota_promedio;
    }
    @Override
    public void imprimir() {
        System.out.println("Soy estudiante tipo 1 "+calc_nota_promedio());
    }
    public int calc_nota_promedio() {
        nota_promedio=(getNota_promedio_examenes()+getNota_promedio_quices()+getNota_promedio_tareas())/3;
        return nota_promedio;
    }
    public int getNota_promedio(){return nota_promedio;}
}
