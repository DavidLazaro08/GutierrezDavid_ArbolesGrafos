package com.david.arbolesgrafos;

import java.util.LinkedList;
import java.util.Queue;

/** Árbol binario (la hice sin recursividad).
 *  Se usa para representar letras con una estructura básica (raíz, hijo izquierdo y derecho).
 *  Inserta letras en las primeras posiciones disponibles y permite mostrar o buscar una letra concreta. */

public class ArbolBinario {

    private NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Inserta una letra
    public void insertar(char dato) {
        if (raiz == null) {
            raiz = new NodoArbol(dato);
        } else if (raiz.izquierdo == null) {
            raiz.izquierdo = new NodoArbol(dato);
        } else if (raiz.derecho == null) {
            raiz.derecho = new NodoArbol(dato);
        } else {
            // Si ya tiene dos hijos, simplemente no inserta más
            System.out.println("No se pueden insertar más nodos en este ejemplo.");
        }
    }

    // Busca una letra en el árbol y muestra el camino
    public boolean buscarCamino(char letra) {
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return false;
        }

        System.out.print("Camino recorrido: ");
        System.out.print(raiz.dato + " ");

        if (raiz.dato == letra) {
            System.out.println("\nLetra encontrada en la raíz.");
            return true;
        } else if (raiz.izquierdo != null && raiz.izquierdo.dato == letra) {
            System.out.println("\nLetra encontrada a la izquierda (L).");
            return true;
        } else if (raiz.derecho != null && raiz.derecho.dato == letra) {
            System.out.println("\nLetra encontrada a la derecha (R).");
            return true;
        } else {
            System.out.println("\nLetra no encontrada en este árbol.");
            return false;
        }
    }

    // Mostrar el árbol por niveles
    public void mostrarPorNiveles() {
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }

        Queue<NodoArbol> cola = new LinkedList<>();
        cola.add(raiz);

        System.out.println("Árbol por niveles:");
        while (!cola.isEmpty()) {
            NodoArbol actual = cola.poll();
            System.out.print(actual.dato + " ");
            if (actual.izquierdo != null) cola.add(actual.izquierdo);
            if (actual.derecho != null) cola.add(actual.derecho);
        }
        System.out.println();
    }
}
