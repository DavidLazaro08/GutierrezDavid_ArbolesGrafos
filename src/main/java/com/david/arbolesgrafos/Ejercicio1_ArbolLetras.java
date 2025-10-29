package com.david.arbolesgrafos;

import java.util.Scanner;

/** Ejercicio 1 - Árbol de letras con búsqueda y recorrido. */
public class Ejercicio1_ArbolLetras {

    public static void ejecutar() {
        Scanner leer = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        System.out.println("EJERCICIO 1: Árbol de Letras");

        // Inserta letras en el árbol
        arbol.insertar('A');
        arbol.insertar('B');
        arbol.insertar('C');

        // Muestra el árbol por niveles
        arbol.mostrarPorNiveles();

        System.out.print("\nIntroduce una letra a buscar: ");
        char letra = leer.next().toUpperCase().charAt(0);

        // Busca la letra e indica el recorrido
        arbol.buscarCamino(letra);

        System.out.println();
    }
}
