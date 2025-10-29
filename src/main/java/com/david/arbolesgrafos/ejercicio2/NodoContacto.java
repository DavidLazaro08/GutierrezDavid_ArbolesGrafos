package com.david.arbolesgrafos;

/* Nodo del árbol binario de búsqueda de contactos.
 * Contiene el nombre y teléfono del contacto y las referencias a sus nodos hijo izquierdo y derecho.
 * Lo utilizamos en el Ejercicio 2 (Listín Telefónico).  */

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
