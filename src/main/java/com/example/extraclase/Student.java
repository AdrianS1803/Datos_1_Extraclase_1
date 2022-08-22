package com.example.extraclase;

public abstract class Student { //Uso de abstraccion, pues un estudiante no solo tiene los siguientes atributos
    //los argumentos de cada estudiante, uso de encapsulación por ser privados y uso de atributos porque solo pertenecen a la clase Student o sus hijos
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

    protected float nota_promedio_ex_qu_ta=0;
    protected float nota_promedio_proyecto=0;

    private float promedio;
    protected float nota_promedio_tipo_estudiante;


    public Student(String carne, String nombre_apellido, String correo, int numero, String nickname, String tipo_student,
                   int nota_promedio_examenes, int nota_promedio_quices, int nota_promedio_tareas,
                   int nota_proyecto_1, int nota_proyecto_2, int nota_proyecto_3) { //metodo para instanciar al estudiante
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
        this.promedio=calc_nota_promedio();
    }

    public String getCarne() {
        return carne;
    } //metodos que permiten acceder al valor de los atributos de la clase Student pero no modificarlo. uso de metodos---------------------
    public String getNombre_apellido() {
        return nombre_apellido;
    }
    public String getCorreo(){return correo;}
    public int getNumero(){return numero;}
    public String getNickname(){return nickname;}
    public String getTipo_student(){return tipo_student;}

    public int getNota_promedio_examenes(){return nota_promedio_examenes;}
    public int getNota_promedio_quices(){return nota_promedio_quices;}
    public int getNota_promedio_tareas(){return nota_promedio_tareas;}
    public int getNota_proyecto_1(){return nota_proyecto_1;}
    public int getNota_proyecto_2(){return nota_proyecto_2;}
    public int getNota_proyecto_3(){return nota_proyecto_3;}

    public float getNota_promedio_proyecto(){return nota_promedio_proyecto;}
    public float getNota_promedio_ex_qu_ta(){return nota_promedio_ex_qu_ta;}

    public float getPromedio(){return promedio;}
//----------------------------------------------------------------------------------------------------------------------------

    public float calc_nota_promedio(){//metodo que permite calccular la nota promedio total
        this.promedio=((getNota_promedio_examenes()+getNota_promedio_quices()+getNota_promedio_tareas()+
                getNota_proyecto_1()+getNota_proyecto_2()+getNota_proyecto_3()))/6;
        return this.promedio;
    }
    public float calc_nota_promedio_tipo_estudiante(){// metodo permite calcular un promedio
        nota_promedio_tipo_estudiante=0;
        return nota_promedio_tipo_estudiante;
    }
}
