package com.hazerta.lecciones;

import java.util.Scanner;

public class EstructurasControl {

    public void notasIf(Scanner sc) {
        String notaCadena = "";
        System.out.println("Introduzca su nota");
        //int notaNumerica = Integer.parseInt(sc.nextLine());
        double notaNumerica;

        notaNumerica = sc.nextDouble();

        if (notaNumerica >= 0 && notaNumerica <= 10) {
            if (notaNumerica <= 2) {
                notaCadena = "Deficiente";
            } else if (notaNumerica < 5) {
                notaCadena = "Insuficiente";
            } else if (notaNumerica < 6) {
                notaCadena = "Suficiente";
            } else if (notaNumerica < 7) {
                notaCadena = "Bien";
            } else if (notaNumerica < 9) {
                notaCadena = "Notable";
            } else if (notaNumerica <= 10) {
                notaCadena = "Sobresaliente";
            }
        } else {
            notaCadena = "La nota no es valida";
        }
        // Versión con el operador ternario
        // notaCadena = notaNumerica < 5 ? "suspenso" : "aprobado";
        System.out.println("Nota: " + notaCadena);
    }

    public void switchSemana(Scanner sc) {
        System.out.println("Introduzca un número del 1 al 7: ");
        int diaSemana;
        diaSemana = sc.nextInt();

        switch (diaSemana) {
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            case 2: // 2 == diaSemana
                System.out.println("Martes");
                break;
            case 1: // 1 == diaSemana
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("No es un día la semana ");
                break;
        }
    }
}
