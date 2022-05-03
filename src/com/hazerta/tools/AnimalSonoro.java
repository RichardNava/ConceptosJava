package com.hazerta.tools;

@FunctionalInterface // Anotación que limita los métodos abstractos a uno para poder usarse con las capacidades de la programación (Expresiones lambda, clases anonimas, referencia a métodos...) 
public interface AnimalSonoro<T> extends PruebaInterfaz { // <T> -> Tipo de dato generico. Se especifica cuando lo implementamos en la clase. Se puede usar cualquier letra pero convención se usa la T.
   
    int NUMERO = 10; // public static final (de forma implicita) - Solo podemos usar constantes
    
    void emitirSonido(); // public abstract (de forma implicita)
    
    //void emitirSonido2(); // public abstract (de forma implicita)
    
    private int metodoPrivado(){ // Podemos declarar métodos privados para uso interno
        int numeroModificado = NUMERO+1;
        return numeroModificado;
    }
    default void metodoDefault(T t, int num){ // Los métodos default son métodos convecionales
        int result = num + metodoPrivado();
        System.out.println("El animal"+t.toString()+" emite "+ result+" sonidos.");
    } 
    static void sonidoApareamiento(){ // También podemos usar métodos estáticos
        System.out.println("Grara grñgrñ");
    }
}
