package com.hazerta.models;

import com.hazerta.tools.AnimalSonoro;
import java.io.Serializable;

public class Ave extends Animal implements AnimalSonoro<Ave>, Serializable {
    private int numPatas;

    public Ave(int numPatas, float peso, long edad, String color) {
        super(peso, edad, color);
        this.numPatas = numPatas;
    }

    public Ave() {

    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return super.toString() + "numPatas=" + numPatas + '}';
    }

    @Override
    public void mover() {
        System.out.println("Las aves vuelan");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Pio, pio");
    }
 
    
 
}
