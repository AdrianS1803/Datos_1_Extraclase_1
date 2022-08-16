package com.example.extraclase;

import com.example.extraclase.Student;

public class Student_1 extends Student {
    int proyecto1;
    //int proyecto2;
    //int proyecto3;

    public Student_1(String carne, String nombre_apellido, String correo, int numero, String nickname, int tipo_student, int proyecto1){
        super(carne,nombre_apellido,correo,numero,nickname,tipo_student);
        this.proyecto1=proyecto1;

    }
    @Override
    public void imprimir() {
        System.out.println("Soy estudiante tipo 1 "+this.tipo_student+""+super.carne+" "+super.nombre_apellido+" "+super.correo+""+super.numero+""+this.nickname+""+this.tipo_student+""+this.proyecto1);
    }
}
