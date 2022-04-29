package com.hazerta.models;

public class Animal extends Object{
    private float peso;
    private long edad;
    private String color;

    public Animal(float peso, long edad, String color) {
        this.peso = peso;
        this.edad = edad;
        this.color = color;
    }

    public Animal() {
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", edad=" + edad + ", color=" + color + '}';
    }

    
    
    
}
