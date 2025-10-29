package com.david.arbolesgrafos.ejercicio2;

import java.util.Scanner;

/* Ejercicio 2 - Listín Telefónico.
 * Utilizamos un árbol binario de búsqueda ahora sí, con recursividad para almacenar contactos.
 * Permite insertar algunos contactos de ejemplo, mostrarlos ordenados y buscar un nombre concreto. */

public class Ejercicio2_ListinTelefonico {

    public static void ejecutar() {
        Scanner leer = new Scanner(System.in);
        ArbolBinarioContactos listin = new ArbolBinarioContactos();

        System.out.println("EJERCICIO 2: Listín Telefónico");

        // Insertamos algunos contactos de ejemplo
        listin.insertar("David", "616540865");
        listin.insertar("G-Print", "619974831");
        listin.insertar("Patricia", "654252880");
        listin.insertar("Random1", "616540865");
        listin.insertar("Random2", "619974831");

        // Mostramos los contactos por orden alfabético
        System.out.println("\nContactos actuales (ordenados):");
        listin.mostrarInOrden();

        // Solicitamos un nombre al usuario
        System.out.print("\nIntroduce un nombre para buscar su teléfono: ");
        String nombre = leer.nextLine();

        // Buscamos el contacto e indicamos el resultado
        String telefono = listin.buscar(nombre);
        if (telefono != null) {
            System.out.println("Teléfono de " + nombre + ": " + telefono);
        } else {
            System.out.println("El contacto '" + nombre + "' no existe en el listín.");
        }

        System.out.println();
    }
}
