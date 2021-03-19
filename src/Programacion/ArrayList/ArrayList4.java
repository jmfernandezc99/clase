package Programacion.ArrayList;

import java.util.*;
public class ArrayList4 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        ArrayList<String> valores = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce una palabra: ");
            String palabra = consola.nextLine();
            valores.add(palabra);
        }

        //Ordenacion
        Collections.sort(valores);

        System.out.println(valores);
    }
}
