package com.david.arbolesgrafos.ejercicio2;

/* Árbol binario de búsqueda para contactos (nombre - teléfono).
 * En este caso sí usamos recursividad para insertar los nodos según el orden alfabético del nombre.
 * Permite buscar contactos mostrando el recorrido y listar todos en orden alfabético. */

public class ArbolBinarioContactos {

    private NodoContacto raiz;

    // Inserta un contacto nuevo por orden alfabético
    public void insertar(String nombre, String telefono) {
        raiz = insertarRec(raiz, nombre, telefono);
    }

    // Inserta de forma recursiva según el nombre
    private NodoContacto insertarRec(NodoContacto nodo, String nombre, String telefono) {
        if (nodo == null) return new NodoContacto(nombre, telefono);

        if (nombre.compareToIgnoreCase(nodo.nombre) < 0)
            nodo.izquierdo = insertarRec(nodo.izquierdo, nombre, telefono);
        else if (nombre.compareToIgnoreCase(nodo.nombre) > 0)
            nodo.derecho = insertarRec(nodo.derecho, nombre, telefono);
        else
            System.out.println("El contacto '" + nombre + "' ya existe.");

        return nodo;
    }

    // Buscamos un contacto por nombre y mostramos el recorrido para darle sentido.
    public String buscar(String nombre) {
        NodoContacto actual = raiz;
        String camino = "";

        while (actual != null) {
            System.out.println("Comprobando el contacto: " + actual.nombre);

            int cmp = nombre.compareToIgnoreCase(actual.nombre);
            if (cmp == 0) {
                System.out.println("Coincidencia encontrada en " + actual.nombre + ".");
                if (!camino.isEmpty()) System.out.println("Recorrido seguido: " + camino);
                return actual.telefono;
            }

            if (cmp < 0) {
                System.out.println(nombre + " va antes que " + actual.nombre + ". Me muevo a la izquierda.");
                camino += "L ";
                actual = actual.izquierdo;
            } else {
                System.out.println(nombre + " va después que " + actual.nombre + ". Me muevo a la derecha.");
                camino += "R ";
                actual = actual.derecho;
            }
        }

        System.out.println("No se encontró el contacto '" + nombre + "'.");
        if (!camino.isEmpty()) System.out.println("Último recorrido seguido: " + camino);
        return null;
    }

    // Muestra los contactos en orden alfabético
    public void mostrarInOrden() {
        mostrarInOrdenRec(raiz);
    }

    private void mostrarInOrdenRec(NodoContacto nodo) {
        if (nodo != null) {
            mostrarInOrdenRec(nodo.izquierdo);
            System.out.println(nodo.nombre + " - " + nodo.telefono);
            mostrarInOrdenRec(nodo.derecho);
        }
    }
}
