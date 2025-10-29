package com.david.arbolesgrafos;

/** Nodo de un árbol binario.
 *  Guarda un carácter y referencias a los hijos izquierdo y derecho.
 *  Lo utilizamos en el Ejercicio 1 (Árbol de Letras). */

public class NodoArbol {
    char dato;
    NodoArbol izquierdo;
    NodoArbol derecho;

    public NodoArbol(char dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
}
