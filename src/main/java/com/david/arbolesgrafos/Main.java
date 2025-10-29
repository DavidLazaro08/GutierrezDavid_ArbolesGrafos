package com.david.arbolesgrafos;

import com.david.arbolesgrafos.ejercicio1.Ejercicio1_ArbolLetras;
import com.david.arbolesgrafos.ejercicio2.Ejercicio2_ListinTelefonico;

import java.util.Scanner;

/** Menú principal */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENÚ PRINCIPAL - ÁRBOLES Y GRAFOS");
            System.out.println("1. Árbol de Letras");
            System.out.println("2. Listín Telefónico (Árbol de búsqueda)");
            System.out.println("3. Planificador de Rutas (Grafo)");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    Ejercicio1_ArbolLetras.ejecutar();
                    break;

                case 2:
                    Ejercicio2_ListinTelefonico.ejecutar();
                    break;

                case 3:
                    Ejercicio3_PlanificadorRutas.ejecutar();
                    break;

                case 4:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            if (opcion != 4) {
                System.out.println("\nPulsa ENTER para volver al menú...");
                leer.nextLine();
            }

        } while (opcion != 4);

        leer.close();
    }
}