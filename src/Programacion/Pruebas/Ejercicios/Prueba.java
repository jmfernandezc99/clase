package Programacion.Pruebas.Ejercicios;

import java.util.Scanner;

public class Prueba {
    public String devolver(String pregunta){
        Scanner consola = new Scanner(System.in);
        System.out.println(pregunta);
        String respuesta = consola.nextLine();
        return respuesta;
    }
}
