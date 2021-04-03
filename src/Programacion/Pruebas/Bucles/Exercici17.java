package Programacion.Pruebas.Bucles;/*
Hecho dia sáb. 21/11/2020
Creado por: Juanma
Paquete: Bucles
Descripcion:Fes un programa que afegeixi els 100 següents nombres a un nombre sencer positiu introduït per teclat. Si el
nombre no és correcte, el tornarà a demanar fins que el nombre sigui correcte.
*/

import java.util.*;
public class Exercici17 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un numero para añadirle 100 numeros más");
        int contador = 0;
        int numero = consola.nextInt();
        while (contador < 100){
            numero++;
            System.out.println(numero);
            contador++;
        }
    }
}
