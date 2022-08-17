package com.example.extraclase;

public class Student {
    private String carne;
    private String nombre_apellido;
    private String correo;
    private int numero;
    private String nickname;
    private String tipo_student;

    private int nota_promedio_examenes;
    private int nota_promedio_quices;
    private int nota_promedio_tareas;

    private int nota_proyecto_1;
    private int nota_proyecto_2;
    private int nota_proyecto_3;


    public Student(String carne, String nombre_apellido, String correo, int numero, String nickname, String tipo_student,
                   int nota_promedio_examenes, int nota_promedio_quices, int nota_promedio_tareas,
                   int nota_proyecto_1, int nota_proyecto_2, int nota_proyecto_3) {
        this.carne = carne;
        this.nombre_apellido = nombre_apellido;
        this.correo = correo;
        this.numero = numero;
        this.nickname = nickname;
        this.tipo_student = tipo_student;
        this.nota_promedio_examenes = nota_promedio_examenes;
        this.nota_promedio_quices = nota_promedio_quices;
        this.nota_promedio_tareas = nota_promedio_tareas;
        this.nota_proyecto_1 = nota_proyecto_1;
        this.nota_proyecto_2 = nota_proyecto_2;
        this.nota_proyecto_3 = nota_proyecto_3;
    }

    public String getCarne() {
        return carne;
    }
    public String getNombre_apellido() {
        return nombre_apellido;
    }
    public String getCorreo(){return correo;}
    public int getNumero(){return numero;}
    public String getNickname(){return nickname;}
    public String getTipo_student(){return tipo_student;}

    public int getNota_promedio_examenes(){return nota_promedio_examenes;}
    public int getNota_promedio_quices(){return nota_promedio_quices;}
    public int getNota_promedio_tareas(){return nota_promedio_quices;}
    public int getNota_proyecto_1(){return nota_proyecto_1;}
    public int getNota_proyecto_2(){return nota_proyecto_2;}
    public int getNota_proyecto_3(){return nota_proyecto_3;}


    public void imprimir(){
        System.out.println("Canet:"+this.carne+" Nombre: "+this.nombre_apellido+" Correo: "+this.correo+" Numero: "+this.numero);

    }


}
