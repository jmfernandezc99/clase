package Programacion.Pruebas.Colecciones;

import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        int contador = 0;
        Map miMapa = new java.util.HashMap();
        miMapa.put(++contador, "Lunes");
        miMapa.put(++contador, "Martes");
        miMapa.put(++contador, "Miercoles");
        miMapa.put(++contador, "Jueves");
        miMapa.put(++contador, "Viernes");
        miMapa.put(++contador, "Sabado");
        miMapa.put(++contador, "Domingo");

        String elemento = (String) miMapa.get(1);
        System.out.println(elemento);

        //keySet para acceder a la key del hashmap
        imprimir(miMapa.keySet());
        //values para acceder al valor del hashmap
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento -> {
            System.out.println(elemento);
        });
    }
}
