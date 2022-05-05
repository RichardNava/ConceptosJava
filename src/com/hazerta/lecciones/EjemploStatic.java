package com.hazerta.lecciones;


public class EjemploStatic {

    public int num1;
    public static int num2;

    static { //Inicializador estático
        System.out.println("Inicializador de instancia");
        //num2++;
    }

    public EjemploStatic() {
        System.out.println("Constructor");
    }

    public static String saludar(String nombre) {
        return "Hola " + nombre;
    }

    public String despedirse(String nombre) {
        return "Adios " + nombre;
    }
}
