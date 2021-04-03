package Programacion.Pruebas.ArrayList;

import java.util.*;
public class ArrayList3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un numero: ");
            int numero = consola.nextInt();
            valores.add(numero);
        }

        //Ordenacion
        Collections.sort(valores);

        System.out.println(valores);
    }
}
