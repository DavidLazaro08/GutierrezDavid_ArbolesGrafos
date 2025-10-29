package com.david.arbolesgrafos;

/** Nodo de un árbol binario (dato + hijos izquierdo y derecho). */
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
