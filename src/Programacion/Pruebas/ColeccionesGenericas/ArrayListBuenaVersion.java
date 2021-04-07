package Programacion.Pruebas.ColeccionesGenericas;

/**
 * Basicamente indicamos el tipo primitivo a usar en las listas.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListBuenaVersion {
    public static void main(String[] args) {

        ArrayList<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        String elemento = miLista.get(0);

        for (Object semana: miLista){
            System.out.println(semana);
        }

        //Funcion flecha a partir de java 8
        //USAR ESTA!!
        miLista.forEach(dia -> {
            System.out.println(dia);
        });
    }

    //Si queremos generalizar usaremos <Object>, pero si queremos ser precisos usar
    //el tipo generico necesario: Integer, String, Double, Float, ...
    public static void imprimir(Collection<Object> coleccion){
        coleccion.forEach(elemento -> {
            System.out.println(elemento);
        });
    }
}
