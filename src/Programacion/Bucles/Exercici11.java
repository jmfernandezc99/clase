package Programacion.Bucles;
import java.util.*;
public class Exercici11 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el " + (i + 1) + " numero: ");
            int num = consola.nextInt();
            double cuadradoNum = Math.pow(num, 2); //funcion pow sirve para elevar numeros
            double cuboNum = Math.pow(num, 3);
            System.out.println(num + " " + cuadradoNum + " " + cuboNum);
        }
    }
}
