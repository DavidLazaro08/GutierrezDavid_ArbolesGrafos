package com.david.arbolesgrafos;

/** Nodo del árbol de contactos (nombre + teléfono). */
public class NodoContacto {
    String nombre;
    String telefono;
    NodoContacto izquierdo;
    NodoContacto derecho;

    public NodoContacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.izquierdo = null;
        this.derecho = null;
    }
}
