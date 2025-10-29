package com.david.arbolesgrafos;

import java.util.Scanner;

/** Ejercicio 2 - Listín telefónico con árbol de búsqueda binario. */
public class Ejercicio2_ListinTelefonico {

    public static void ejecutar() {
        Scanner leer = new Scanner(System.in);
        ArbolBinarioContactos listin = new ArbolBinarioContactos();

        System.out.println("=== EJERCICIO 2: Listín Telefónico ===");

        // Insertamos algunos contactos iniciales
        listin.insertar("David", "616540865");
        listin.insertar("G-Print", "619974831");
        listin.insertar("Patricia", "654252880");
        listin.insertar("Random1", "616540865");
        listin.insertar("Random2", "619974831");

        // Mostramos los contactos por orden alfabético (inorden)
        System.out.println("\nContactos actuales (ordenados):");
        listin.mostrarInOrden();

        System.out.print("\nIntroduce un nombre para buscar su teléfono: ");
        String nombre = leer.nextLine();

        // Buscar contacto
        String telefono = listin.buscar(nombre);
        if (telefono != null) {
            System.out.println("Teléfono de " + nombre + ": " + telefono);
        } else {
            System.out.println("El contacto '" + nombre + "' no existe en el listín.");
        }

        System.out.println();
    }
}
