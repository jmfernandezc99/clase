package Programacion.Pruebas.Arrays;/*
Hecho dia mar. 24/11/2020
Creado por: Juanma
Paquete: Pruebas
Descripcion: Pruebas personales para la preparacion del examen.
*/

public class PruebasArrays3 {
    public static void main(String[] args) {
        int[] a=new int[100];
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            a[i+1]=i;
            b+=a[i];
        }
        System.out.println(b);
    }
}
