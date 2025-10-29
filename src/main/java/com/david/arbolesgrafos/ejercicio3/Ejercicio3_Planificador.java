package com.david.arbolesgrafos.ejercicio3;

import java.util.Scanner;

/* Ejercicio 3 - Planificador de Rutas.
 * Simula un grafo de ciudades con rutas bidireccionales.
 * Permite mostrar el mapa completo de conexiones y consultar las rutas disponibles desde una ciudad concreta.
 * No utilizamos recursividad. */

public class Ejercicio3_Planificador {

    public static void ejecutar() {
        Scanner leer = new Scanner(System.in);
        Grafo mapa = new Grafo();

        System.out.println("EJERCICIO 3: Planificador de Rutas");

        // Ciudades de ejemplo
        mapa.conectar("Sevilla", "Córdoba");
        mapa.conectar("Sevilla", "Huelva");
        mapa.conectar("Córdoba", "Granada");
        mapa.conectar("Huelva", "Cádiz");
        mapa.conectar("Granada", "Málaga");

        // Muestra el mapa completo
        System.out.println("\nMapa de conexiones:");
        mapa.mostrarGrafo();

        System.out.print("\nIntroduce una ciudad para ver sus rutas: ");
        String ciudad = leer.nextLine();

        NodoGrafo origen = mapa.buscarCiudad(ciudad);
        if (origen != null) {
            System.out.println("\nDesde " + origen.nombre + " puedes ir a:");
            for (NodoGrafo con : origen.conexiones) {
                System.out.println("- " + con.nombre);
            }
        } else {
            System.out.println("La ciudad '" + ciudad + "' no está registrada en el mapa.");
        }

        System.out.println();
    }
}
