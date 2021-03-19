// Donats dos vectors, escriu una funció que retorni el seu producte escalar i una altra funció
// que retorni el producte vectorial.

package Programacion.Pruebas;

import java.util.Scanner;

public class Exercici12 {
    public static void main(String[] args) {

        System.out.println("Recorda que els vectors han d'estar en 2D.");

        double v1[] = new double[3];
        double v2[] = new double[3];

        crearVector(v1, 1);
        crearVector(v2, 2);
        imprimirVector(v1, 1);
        imprimirVector(v2, 2);
        producteEscalar(v1, v2);
        producteVectorial(v1, v2);
    }

    private static void crearVector(double ar[], int x) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ar.length; i++) {
            System.out.print("Introdueix el valor " + (i + 1) + " del vector " + x + " :");
            ar[i] = sc.nextDouble();
        }
    }

    private static void imprimirVector(double ar[], int x) {
        System.out.print("Vector " + x + ": ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.print("\n");
    }

    private static void producteEscalar(double ar[], double ar2[]) {
        // a ⋅ b = ∣∣ a ∣∣ ⋅ ∣∣ b ∣∣
        double ab;

        ab = ar[0] * ar2[0] + ar[1] * ar2[1] + ar[2] * ar2[2];

        System.out.println("El producte escalar és: " + ab);
    }

    private static void producteVectorial(double ar[], double ar2[]) {
        double producteVectorial[] = new double[3];
        producteVectorial[0] = (ar[1] * ar2[2]) - (ar[2] * ar2[1]);
        producteVectorial[1] = -((ar[0] * ar2[2]) - (ar[2] * ar2[0]));
        producteVectorial[2] = (ar[0] * ar2[1]) - (ar[1] * ar2[0]);

        System.out.print("El producte vectorial és: ");
        imprimirVector(producteVectorial,3);
    }
}
