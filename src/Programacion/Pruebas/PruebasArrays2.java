package Programacion.Pruebas;/*
Hecho dia sáb. 14/11/2020
Creado por: Juanma
Paquete: PracticaArrays
Descripcion:
*/

import java.util.*;

public class PruebasArrays2 {
    public static void main(String[] args) {
        int ultimo = 0;
        int suma = 0;

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce un valor: ");
        int valor = consola.nextInt();
        while (valor > 0) {
            numeros.add(valor);
            System.out.print("Introduce otro valor: ");
            valor = consola.nextInt();
        }

        for(int i:numeros){
            suma += i;
        }
        int media = suma/numeros.size();
        System.out.println(media);
    }
}
