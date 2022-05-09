package com.hazerta.app;

import com.hazerta.colecciones.Matrices;
import com.hazerta.errors.MiExcepcion;
import com.hazerta.errors.TestExcepcion;
import com.hazerta.lecciones.EjemploStatic;
import com.hazerta.lecciones.DatosPrimitivos;
import com.hazerta.lecciones.EstructurasControl;
import com.hazerta.models.Animal;
import com.hazerta.models.Ave;
import com.hazerta.models.Pez;
import com.hazerta.tools.AnimalSonoro;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class AppMain {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        EstructurasControl ec = new EstructurasControl();
        Matrices mat = new Matrices();
        
        try (Scanner sc = new Scanner(System.in);) {
            //ec.notasIf(sc);
            //ec.switchSemana(sc);
            mat.mostrarBiMatriz(mat.crearBiMatriz(sc));
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("No ha introducido un número correcto.");
        } finally {
            System.out.println("Estoy en Finally.");
            //sc.close();
        }
//       DatosPrimitivos dp = new DatosPrimitivos();
//        dp.maxValoresNumericos(44);
//        System.out.println("\n");
//        dp.maxValoresNumericos(1235);
//        System.out.println("\n");
//        int resultado = dp.sumar(15, 5);
//        System.out.println(resultado);

//        Ave gorrion = new Ave();
//        gorrion.setColor("Rojo");
//        gorrion.setPeso(3);
//        gorrion.setEdad(4);
//        Ave canario = new Ave(2, 2.8f, 2, "amarillo");
//        Pez sardina = new Pez();
//
//        String colorCanario = canario.getColor();
//
//        System.out.println("El color del canario es " + colorCanario);
//        System.out.println("El peso del gorrion es " + gorrion.getPeso());
//        Animal animal = new Pez();
//        animal.mover();
//        gorrion.emitirSonido();
//        AnimalSonoro.sonidoApareamiento(); // Éstatico
//        var animales = new Animal[3];
//        animales[0] = gorrion;
//        animales[1] = canario;
//        animales[2] = sardina;
//      
//        EjemploStatic a1 = new EjemploStatic();
//        EjemploStatic a2 = new EjemploStatic();
//        a1.num1++; // a1.num1 = a1.num1 + 1;
//        a1.num2++;
//        System.out.println(a1.num1 + " " + EjemploStatic.num2); // 1 1
//        a2.num1++;
//        a2.num2++; // 2
//        System.out.println(a2.num1 + " " + EjemploStatic.num2); // 1 2    
//        //System.out.println(a1.despedirse("Ricardo")+" "+a1.num1+" "+a1.num2+" "+a1.saludar("Roberto"));
//        //System.out.println(A.saludar("Ricardo")+" "+A.num2);

//
//        int[][] decimales = new int[3][5];
//        decimales[0][0] = 1;
//        decimales[0][1] = 2;
//        decimales[0][2] = 3;
//        decimales[0][3] = 4;
//        decimales[0][4] = 5;
//        decimales[1][0] = 2;
//        decimales[1][1] = 4;
//        decimales[1][2] = 6;
//        decimales[1][3] = 8;
//        decimales[1][4] = 10;
//        decimales[2][0] = 3;
//        decimales[2][1] = 6;
//        decimales[2][2] = 9;
//        decimales[2][3] = 12;
//        decimales[2][4] = 15;
//
//        // System.out.println(dp.charEnMinusculas(64));
//        int num = 10;
//        boolean comp = true;
//        while (comp) {
//            System.out.println("Dentro del bucle while " + num);
//            num++;
//            if (num >= 5) {
//                comp = false;
//            }
//        }
//        System.out.println("Fuera del bucle " + num);
//
//        do {
//            num--;
//            System.out.println("Dentro del bucle do-while " + num);
//        } while (num > 0);
//        System.out.println("Fuera del bucle " + num);
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Número de vuelta: " + i);
//
//        } // i = i + 1;
//
//        for (int i = 0; i < filaNombres1.length; i++) {
//            System.out.println("Siguiente nombre en Bucle For: " + filaNombres1[i]);
//        }
//
////        for (int i = filaNombres1.length-1; i>=0; i--) {
////            System.out.println("Siguiente nombre: "+filaNombres1[i]);
////    4    }
//        for (String nombre : filaNombres1) {
//            System.out.println("Siguiente nombre en Bucle For-Each: " + nombre);
//        }
//
//        int n = 0;
//        for (int[] decimal : decimales) {
//            for (int i : decimal) {
//                System.out.println(i);
//            }
//            n++;
//            System.out.println("\t------Revisada matriz nº " + n + "-------");
//        }
//        for (Animal an : animales) {
//            System.out.println(an.toString());
//        }
//        var te = new TestExcepcion();
//
//        try {
//            te.lanzarExcepcion();
//        } catch (MiExcepcion ex) {
//            System.out.println("Estoy en el catch de mi excepción.");
//        }
//
//        try {
//            te.lanzarExcepcion2();
//        } catch (FileNotFoundException ex) {
//            //Logger.getLogger(AppMain.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Estoy en una excepcion checked");
//        }
            //TODO: Seguir mirando las listas 
          List<String> nombres = new ArrayList<>();
          nombres.add("Ricardo");
    }

}
