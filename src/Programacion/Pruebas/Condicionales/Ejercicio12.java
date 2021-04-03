package Programacion.Pruebas.Condicionales;
import java.util.*;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("La arquitectura Von Newmann es la arquitectura de computacion actual?");
        System.out.println("1 = V");
        System.out.println("2 = F");
        int puntuacionTotal = 0;
        int respuesta = consola.nextInt();
        if (respuesta == 1){
            puntuacionTotal = puntuacionTotal + 1;
        }
        else {
            puntuacionTotal = puntuacionTotal + 0;
        }

        System.out.println("SQL es un lenguaje de programacion de nivel 3.");
        System.out.println("1 = V");
        System.out.println("2 = F");
        respuesta = consola.nextInt();
        if (respuesta == 2){
            puntuacionTotal = puntuacionTotal + 1;
        }
        else {
            puntuacionTotal = puntuacionTotal + 0;
        }

        System.out.println("El codigo espagueti es un buen metodo de programacion.");
        System.out.println("1 = V");
        System.out.println("2 = F");
        respuesta = consola.nextInt();
        if (respuesta == 2){
            puntuacionTotal = puntuacionTotal + 1;
        }
        else {
            puntuacionTotal = puntuacionTotal + 0;
        }

        System.out.println("En Java puede hacerse programacion orientada a objetos.");
        System.out.println("1 = V");
        System.out.println("2 = F");
        respuesta = consola.nextInt();
        if (respuesta == 1){
            puntuacionTotal = puntuacionTotal + 1;
        }
        else {
            puntuacionTotal = puntuacionTotal + 0;
        }

        System.out.println("La abtraccion es un paradigma de programacion");
        System.out.println("1 = V");
        System.out.println("2 = F");
        respuesta = consola.nextInt();
        if (respuesta == 2){
            puntuacionTotal = puntuacionTotal + 1;
        }
        else {
            puntuacionTotal = puntuacionTotal + 0;
        }

        System.out.println("SQL es un lenguaje de programacion orientado a bases de datos.");
        System.out.println("1 = V");
        System.out.println("2 = F");
        respuesta = consola.nextInt();
        if (respuesta == 1){
            puntuacionTotal = puntuacionTotal + 1;
        }
        else {
            puntuacionTotal = puntuacionTotal + 0;
        }

        System.out.println("Mediante java no podemos conectarnos a una base de datos para hacer consultas.");
        System.out.println("1 = V");
        System.out.println("2 = F");
        respuesta = consola.nextInt();
        if (respuesta == 2){
            puntuacionTotal = puntuacionTotal + 1;
        }
        else {
            puntuacionTotal = puntuacionTotal + 0;
        }

        System.out.println("Para comparar dos cadenas de texto en Java usaremos '=='.");
        System.out.println("1 = V");
        System.out.println("2 = F");
        respuesta = consola.nextInt();
        if (respuesta == 2){
            puntuacionTotal = puntuacionTotal + 1;
        }
        else {
            puntuacionTotal = puntuacionTotal + 0;
        }

        System.out.println("Las variables de tipo Scanner sirven para guardar variables mediante teclado por consola.");
        System.out.println("1 = V");
        System.out.println("2 = F");
        respuesta = consola.nextInt();
        if (respuesta == 1){
            puntuacionTotal = puntuacionTotal + 1;
        }
        else {
            puntuacionTotal = puntuacionTotal + 0;
        }

        System.out.println("El resultado de un condicional en Java debe ser de tipo booleano.");
        System.out.println("1 = V");
        System.out.println("2 = F");
        respuesta = consola.nextInt();
        if (respuesta == 1){
            puntuacionTotal = puntuacionTotal + 1;
        }
        else {
            puntuacionTotal = puntuacionTotal + 0;
        }
        System.out.println("Su puntuacion es de " + puntuacionTotal + " puntos.");
    }
}
