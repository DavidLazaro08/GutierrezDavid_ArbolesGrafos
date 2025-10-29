package com.david.arbolesgrafos.ejercicio3;

import java.util.ArrayList;
import java.util.List;

/* Grafo con ciudades y rutas entre ellas.
 * Representa una red de conexiones bidireccionales entre nodos (ciudades).
 * Nos permite añadir nuevas ciudades, conectar unas con otras y mostrar todas las rutas disponibles.
 * No utilizamos recursividad. */

public class Grafo {
    private List<NodoGrafo> ciudades;

    public Grafo() {
        ciudades = new ArrayList<>();
    }

    // Añade una ciudad nueva
    public NodoGrafo agregarCiudad(String nombre) {
        NodoGrafo ciudad = buscarCiudad(nombre);
        if (ciudad == null) {
            ciudad = new NodoGrafo(nombre);
            ciudades.add(ciudad);
        }
        return ciudad;
    }

    // Crea una ruta entre dos ciudades (bidireccional)
    public void conectar(String origen, String destino) {
        NodoGrafo c1 = agregarCiudad(origen);
        NodoGrafo c2 = agregarCiudad(destino);

        c1.conectar(c2);
        c2.conectar(c1);
    }

    // Busca una ciudad por nombre
    public NodoGrafo buscarCiudad(String nombre) {
        for (NodoGrafo c : ciudades) {
            if (c.nombre.equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    // Muestra todas las ciudades y sus conexiones
    public void mostrarGrafo() {
        System.out.println("Conexiones registradas:");
        for (NodoGrafo c : ciudades) {
            System.out.print("- " + c.nombre + " está conectada con: ");
            if (c.conexiones.isEmpty()) {
                System.out.println("(sin rutas)");
            } else {
                for (int i = 0; i < c.conexiones.size(); i++) {
                    System.out.print(c.conexiones.get(i).nombre);
                    if (i < c.conexiones.size() - 1) System.out.print(", ");
                }
                System.out.println();
            }
        }
    }
}
