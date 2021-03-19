package Programacion.Bucles;/*
Hecho dia sáb. 21/11/2020
Creado por: Juanma
Paquete: Bucles
Descripcion:Fes un programa que obtingui i mostri els nombres sencers entre dos nombres introduïts per teclat que el
programa validi que siguin diferents, de manera que hauria de començar des del més petit amb increments de 7 en 7 fins
arribar al més gran.
*/

import java.util.Scanner;
public class Exercici18 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        int numero1 = consola.nextInt();
        System.out.println("Introduce el segundo numero.");
        int numero2 = consola.nextInt();
        if (numero1 < numero2){
            while (numero1 != numero2){
                System.out.println(numero1);
                numero1 += 7;
            }
            System.out.println(numero1);
        }
        else if (numero1 == numero2){
            System.out.println("Los numeros son iguales");
        }
        else if (numero2 < numero1){
            while (numero2 != numero1){
                System.out.println(numero2);
                numero2 += 7;
            }
            System.out.println(numero2);
        }
    }
}
