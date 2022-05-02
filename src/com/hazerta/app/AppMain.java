package com.hazerta.app;

import com.hazerta.lecciones.DatosPrimitivos;
import com.hazerta.models.Ave;
import com.hazerta.models.Pez;

public class AppMain {
  
    public static void main(String[] args) {
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
            

          
    }
    
}
