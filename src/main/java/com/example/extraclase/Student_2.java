package com.example.extraclase;

import com.example.extraclase.Student;

public class Student_2 extends Student {
    int nota1;
    //int nota2;
    //int nota3;

    public Student_2(String carne, String nombre_apellido, String correo, int numero, String nickname, int tipo_student, int nota1){
        super(carne,nombre_apellido,correo,numero,nickname,tipo_student);
        this.nota1=nota1;

    }
    @Override
    public void imprimir() {
        System.out.println("Soy estudiante tipo 2 "+this.tipo_student+""+super.carne+" "+super.nombre_apellido+" "+super.correo+""+super.numero+""+this.nickname+""+this.tipo_student+""+this.nota1);
    }
}
