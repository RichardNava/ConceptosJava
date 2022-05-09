package com.hazerta.colecciones;

import java.util.Scanner;

public class Matrices {
   public String[] crearMatriz(Scanner sc){
       System.out.println("Indique el número de datos que desea introducir: ");
       int cant = sc.nextInt();
       String[] nombres = new String[cant];
       for (int i = 0; i < nombres.length; i++) {
           System.out.println("Introduce el "+(i+1)+"º nombre: ");
           nombres[i] = sc.next();
       }
       return nombres;
   }
   public String[][] crearBiMatriz(Scanner sc){
       System.out.println("Indique el número de conjuntos de datos que quieres crear: ");
       int cant = sc.nextInt();
       String[][] nombres = new String[cant][];
       for (int i = 0; i < nombres.length; i++) {       
           nombres[i] = crearMatriz(sc);
       }
       return nombres;    
   }
   public void mostrarMatriz(double[] datos){
       for (double dato : datos) {
           System.out.println("\tEl nombre es: "+dato);
       }
   }
   public void mostrarMatriz(String[] datos){
       for (String dato : datos) {
           System.out.println("\tEl nombre es: "+dato);
       }
   }
   public void mostrarBiMatriz(String[][] datos){
       int contador = 1;
       for(String[] dato : datos){
           System.out.println("----------------------------");
           System.out.println("Conjunto de datos "+contador);
           mostrarMatriz(dato);
           contador++;
       }
   }
}
