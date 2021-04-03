package Programacion.Pruebas.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades[0]);

        edades[0] = 1;
        System.out.println("edades = " + edades[0]);

        for (int i = 0; i < edades.length; i++) {
            edades[i] = i + 1;
            System.out.println(edades[i]);
        }
    }
}
