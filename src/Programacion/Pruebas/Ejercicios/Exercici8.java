// Escriu una funció que retorna una còpia d'un array bidimensional d'enters, que li passem
// com a paràmetre.

package Programacion.Pruebas.Ejercicios;
import java.util.Scanner;

public class Exercici8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el tamany de l'array (ample): ");
        int x = sc.nextInt();
        System.out.print("Introdueix el tamany de l'array (llarg): ");
        int y = sc.nextInt();

        int ar[][] = new int[x][y];
        int ar2[][] = new int[x][y];

        demanarArray(ar, x, y, sc);
        System.out.println("Array 1:");
        imprimirArray(ar, x, y);

        copiarArray(ar, ar2, x, y);

        System.out.println("Còpia de l'array:");
        imprimirArray(ar2, x, y);
    }

    private static int[][] demanarArray (int ar[][], int x, int y, Scanner sc){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Introdueix el valor per a [x" + i + ", y" + j + "] :");
                ar[i][j] = sc.nextInt();
            }
        }
        return ar;
    }

    private static int[][] copiarArray (int ar[][], int ar2[][], int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ar2[i][j] = ar[i][j];
            }
        }
        return ar2;
    }

    private static void imprimirArray (int ar[][], int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.print("\n");
        }
    }
}
