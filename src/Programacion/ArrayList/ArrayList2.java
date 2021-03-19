package Programacion.ArrayList;

import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(11) + 10;
        int valoresAleatorios;
        ArrayList<Integer> valores = new ArrayList<>();

        int totalSuma = 0;
        int totalMedia = 0;

        //Meter valores en arraylist
        for (int i = 0; i < n; i++) {
            valoresAleatorios = random.nextInt(101);
            valores.add(valoresAleatorios);
        }

        //Mostramos el arraylist
        System.out.println(valores);

        //Calculo de la suma
        for (int i = 0; i < valores.size(); i++) {
            totalSuma += valores.get(i);
        }
        System.out.println("La suma es: " + totalSuma);

        //Calculo de la media
        for (int i = 0; i < valores.size(); i++) {
            totalMedia += valores.get(i);
        }
        double media = totalMedia / n;
        System.out.println("La media es: " + (media));

        //Calculo del max
        int max = Collections.max(valores);
        System.out.println("El máximo es: " + max);

        //Calculo del min
        int min = Collections.min(valores);
        System.out.println("El mínimo es: " + min);
    }
}
