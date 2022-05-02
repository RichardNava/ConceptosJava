package com.hazerta.lecciones;

public class DatosPrimitivos {

    //Estructura de un método
    //[modificador de acceso][tipo de retorno][indentificador][(argumentos si los hubiera)][{}]
    public void maxValoresNumericos(int factor) { // Package-private
        // Datos númericos enteros
        byte numByte = Byte.MAX_VALUE; //Autounboxing
        short numShort = Short.MAX_VALUE;
        int numInt = Integer.MAX_VALUE;
        long numLong = Long.MAX_VALUE + factor; // se pone 'L' al final del número que asignemos para diferenciarlo de int
        // Datos númericos con decimales
        float numFloat = Float.MAX_VALUE; // se pone 'f' o 'F' al final del número que asignemos para diferenciarlo de double
        double numDouble = Double.MAX_VALUE;

        System.out.println("Número máximo byte= " + numByte
                + "\nNúmero máximo short= " + numShort
                + "\nNúmero máximo int= " + numInt
                + "\nNúmero máximo long=" + numLong
                + "\nNúmero máximo float=" + String.format("%.2f", numFloat)
                + "\nNúmero máximo double=" + String.format("%.2f", numDouble));
    }
    // Sobrecarga de un método. El requesito es que cambiemos los argumentos en su tipo y/o cantidad
    public int sumar(int num1, int num2) {
        //Palabra reservada que se usa para devolver un tipo de dato 
        return num1 + num2 + 10;
    }

    public int sumar(Integer num1, Integer num2) {
        //Palabra reservada que se usa para devolver un tipo de dato 
        return num1 + num2 + 100;
    }

    public int sumar(long num1, long num2) {
        //Palabra reservada que se usa para devolver un tipo de dato 
        return (int) (num1 + num2 + 1000);
    }

    public int sumar(Long num1, Long num2) {
        //Palabra reservada que se usa para devolver un tipo de dato 
        return (int) (num1 + num2 + 10_000);
    }

    public char charEnMinusculas(char charCase) {
        return (char) (charCase + 32);
    }

    public char charEnMinusculas(int charCase) {
        return (char) (charCase + 32);
    }

}
