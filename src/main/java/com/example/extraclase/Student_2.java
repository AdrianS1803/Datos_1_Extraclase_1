package com.example.extraclase;
public class Student_2 extends Student {
    public Student_2(String carne, String nombre_apellido, String correo, int numero, String nickname, String tipo_student,
                     int nota_promedio_examenes, int nota_promedio_quices, int nota_promedio_tareas,
                     int nota_proyecto_1, int nota_proyecto_2, int nota_proyecto_3) {

        super(carne, nombre_apellido, correo, numero, nickname, tipo_student,
                nota_promedio_examenes, nota_promedio_quices, nota_promedio_tareas,
                nota_proyecto_1, nota_proyecto_2, nota_proyecto_3);

        this.nota_promedio_proyecto = calc_nota_promedio_tipo_estudiante();
    }

    @Override
    public float calc_nota_promedio_tipo_estudiante() {
        nota_promedio_tipo_estudiante = (getNota_proyecto_1() + getNota_proyecto_2() + getNota_proyecto_3()) / 3;
        return nota_promedio_tipo_estudiante;
    }
}
