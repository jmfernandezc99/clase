package Programacion.Pruebas;/*
Hecho dia sáb. 14/11/2020
Creado por: Juanma
Paquete: PracticaArrays
Descripcion: Ejercicios de prueba de arrays.
*/

import java.util.*;
public class PruebasArrays1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //declarar array sin campos
        int[] nums = new int[5];
        int[] cuadrados = new int[5];
        int[] cubos = new int[5];
        int num;
        //declarar array con campos
        //int arrayCampos[] = {0, 1, 2, 3, 4, 5};

        //for
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Introduce un numero: ");
            num = consola.nextInt();
            nums[i] = num;
            cuadrados[i] = nums[i] * nums[i];
            cubos[i] = nums[i] * nums[i] * nums[i];
        }

        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j] + " " + cuadrados[j] + " " + cubos[j] );
        }
    }
}
