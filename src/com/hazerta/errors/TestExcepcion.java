package com.hazerta.errors;

import java.io.FileNotFoundException;

public class TestExcepcion {
    
    public void lanzarExcepcion() throws MiExcepcion{
        System.out.println("Estoy en mi excepción.");
        throw new MiExcepcion();
    }
    public void lanzarExcepcion2() throws FileNotFoundException{
        System.out.println("Estoy en mi excepción.");
        throw new FileNotFoundException();
    }
    
}
