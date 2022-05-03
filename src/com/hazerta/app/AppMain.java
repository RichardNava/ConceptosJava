package com.hazerta.app;

import com.hazerta.lecciones.DatosPrimitivos;
import com.hazerta.models.Animal;
import com.hazerta.models.Ave;
import com.hazerta.models.Pez;
import com.hazerta.tools.AnimalSonoro;
import java.util.Arrays;

public class AppMain {
    
    String texto = "La casa de papel";

    public static void main(String[] args) {
        new AppMain().texto += " maché";
        DatosPrimitivos dp = new DatosPrimitivos();
//        dp.maxValoresNumericos(44);
//        System.out.println("\n");
//        dp.maxValoresNumericos(1235);
//        System.out.println("\n");
//        int resultado = dp.sumar(15, 5);
//        System.out.println(resultado);

        Ave gorrion = new Ave();
        gorrion.setColor("Rojo");
        gorrion.setPeso(3);
        gorrion.setEdad(4);
        Ave canario = new Ave(2, 2.8f, 2, "amarillo");
        Pez sardina = new Pez();
        
        String colorCanario = canario.getColor();
        
        System.out.println("El color del canario es "+canario.toString());
        System.out.println("El peso del gorrion es "+gorrion.getPeso());
            
        Animal animal = new Pez();
        animal.mover();
        gorrion.emitirSonido();
        AnimalSonoro.sonidoApareamiento(); // Éstatico
        A a1 = new A();
        A a2 = new A();
        a1.num1++; // a1.num1 = a1.num1 + 1;
        a1.num2++;
        System.out.println(a1.num1 + " " + A.num2); // 1 1
        a2.num1++;
        a2.num2++; // 2
        System.out.println(a2.num1 + " " + A.num2); // 1 2
        //System.out.println(a1.despedirse("Ricardo")+" "+a1.num1+" "+a1.num2+" "+a1.saludar("Roberto"));
        //System.out.println(A.saludar("Ricardo")+" "+A.num2);
        String[] filaNombres1 = new String[5]; // Array, matriz, arreglo
        filaNombres1[0] = "Ricardo";
        filaNombres1[1] = "Maria Jose";
        filaNombres1[2] = "Eddie";
        filaNombres1[3] = "Nereida";
        filaNombres1[4] = "Araceli";
        //System.out.println(Arrays.toString(nombres));
        System.out.println(filaNombres1[1]+" "+filaNombres1[3]);
        System.out.println(filaNombres1.length);
        
        String [] filaNombres2  = new String[]{"Arturo","Cesar","Cristina","Mudassar","Carmen"};
        String [] filaNombres3  = {"Sonia","Paula","Francisco","Oscar","Antonio","Paco"};
        
        String [][] tablaNombres = new String[3][];
        tablaNombres[0] = filaNombres1;
        tablaNombres[1] = filaNombres2;
        tablaNombres[2] = filaNombres3;
        
        
        new AppMain().matrices(new int[]{120,212,3412});
        var animales = new Animal[3]; 
        animales[0]=gorrion;
        animales[1]=canario;
        animales[2]=sardina;
        int[][] decimales = new int[3][5];
        decimales[0][0] = 1;
        decimales[0][1] = 2;
        decimales[0][2] = 3;
        decimales[0][3] = 4;
        decimales[0][4] = 5;
        decimales[1][0] = 2;
        decimales[1][1] = 4;
        decimales[1][2] = 6;
        decimales[1][3] = 8;
        decimales[1][4] = 10;
        decimales[2][0] = 3;
        decimales[2][1] = 6;
        decimales[2][2] = 9;
        decimales[2][3] = 12;
        decimales[2][4] = 15;

        char cosa = 65;
        cosa += 32;

        System.out.println(cosa);
    }
    
    public void matrices(int[] numeros){}
    
    static {
        System.out.println("Soy un inicializador Estático");
    }
}

class A {

    int num1;
    static int num2;

    {
        System.out.println("Inicializador de instancia");
        num2++;
    }

    public A() {
        System.out.println("Constructor");
    }

    public static String saludar(String nombre) {
        return "Hola " + nombre;
    }

    public String despedirse(String nombre) {
        return "Adios " + nombre;
    }
}
