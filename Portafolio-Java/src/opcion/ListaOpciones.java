package opcion;

import java.util.Scanner;

public class ListaOpciones {
    public static void carga() {
        String[] Lista = {
                "Calculadora", "IMC",
                "F/C", "Calcular",
                "Edad", "Lista compras",
                "Opcion_7", "Opcion_8",
                "Opcion_9", "Exit"
        };
        for (int i = 0; i < Lista.length; i++) {
                System.out.printf("[%d] %-12s", (i + 1), Lista[i]);

                for (int f = 0; f<1;f++) {
                    System.out.print("  ");
                }
                if ((i + 1) % 2 == 0 || i == Lista.length - 1) {
                    System.out.println();




                } }}
    }







