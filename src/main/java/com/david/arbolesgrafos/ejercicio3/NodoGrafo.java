package com.david.arbolesgrafos.ejercicio3;

import java.util.ArrayList;
import java.util.List;

/* Nodo del grafo utilizado en el Ejercicio 3 (Planificador de Rutas).
 * Representa una ciudad y almacena una lista de otras ciudades conectadas con ella. */

public class NodoGrafo {
    String nombre;
    List<NodoGrafo> conexiones;

    public NodoGrafo(String nombre) {
        this.nombre = nombre;
        this.conexiones = new ArrayList<>();
    }

    // Conecta esta ciudad con otra
    public void conectar(NodoGrafo destino) {
        if (!conexiones.contains(destino)) {
            conexiones.add(destino);
        }
    }
}
