package com.example.extraclase;
public class Student_1 extends Student {
    public Student_1(String carne, String nombre_apellido, String correo, int numero, String nickname, String tipo_student,
                     int nota_promedio_examenes, int nota_promedio_quices, int nota_promedio_tareas,
                     int nota_proyecto_1, int nota_proyecto_2, int nota_proyecto_3){ //metodo para instanciar un Student_1

        super(carne,nombre_apellido,correo,numero,nickname,tipo_student,
                nota_promedio_examenes,nota_promedio_quices,nota_promedio_tareas,
                nota_proyecto_1,nota_proyecto_2,nota_proyecto_3);//hereda de la clase padre, uso de la herencia

        this.nota_promedio_ex_qu_ta=calc_nota_promedio_tipo_estudiante();
    }
    @Override
    public float calc_nota_promedio_tipo_estudiante(){//metodo para calcular el la nota promedio en examens, quices y tareas, uso de la sobreescritura y poliformismo
        nota_promedio_tipo_estudiante=(getNota_promedio_examenes()+getNota_promedio_quices()+getNota_promedio_tareas())/3;
        return nota_promedio_tipo_estudiante;
    }
}