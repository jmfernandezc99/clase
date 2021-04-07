package Programacion.Pruebas.Colecciones;

import java.util.*;

public class ArrayListBuenaVersion {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        for (Object semana: miLista){
            System.out.println(semana);
        }

        //Funcion flecha a partir de java 8
        //USAR ESTA!!
        miLista.forEach(dia -> {
            System.out.println(dia);
        });
    }

    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento -> {
            System.out.println(elemento);
        });
    }
}
