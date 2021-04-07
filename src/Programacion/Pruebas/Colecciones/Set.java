package Programacion.Pruebas.Colecciones;

/**
 * La diferencia entre un set y un list es que el arraylist guarda tal como lo metemos el orden
 * y el set no guarda este orden, y además no se pueden duplicar elementos, a diferencia del arraylist.
 */

import java.util.*;

public class Set {
    public static void main(String[] args) {
        /**
         * Set miSet = new HashSet();
         *         miSet.add("Lunes");
         *         miSet.add("Martes");
         *         miSet.add("Miercoles");
         *         miSet.add("Jueves");
         *         miSet.add("Viernes");
         *         miSet.add("Sabado");
         *         miSet.add("Domingo");
         *         imprimir(miSet);
         */
    }

    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento -> {
            System.out.println(elemento);
        });
    }
}
