package com.example.extraclase;

public class Student {
    String carne;
    String nombre_apellido;
    String correo;
    int numero;
    String nickname;
    int tipo_student;

    public Student(String carne, String nombre_apellido, String correo, int numero, String nickname, int tipo_student){
        this.carne=carne;
        this.nombre_apellido=nombre_apellido;
        this.correo=correo;
        this.numero=numero;
        this.nickname=nickname;
        this.tipo_student=tipo_student;
    }


    public void imprimir(){
        System.out.println("Canet:"+this.carne+" Nombre: "+this.nombre_apellido+" Correo: "+this.correo+" Numero: "+this.numero);

    }
}
