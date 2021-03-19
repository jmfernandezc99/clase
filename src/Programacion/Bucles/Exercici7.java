package Programacion.Bucles;
import java.util.Scanner;
public class Exercici7 {
    public static void main(String[] args) {
        for (int i = 4 ; i > 0 ; i--){
            int codigoMaquina = 1234;
            Scanner consola = new Scanner(System.in);
            System.out.println("Introduzca un codigo de 4 digitos: ");
            int contrasena = consola.nextInt();
            if (contrasena == codigoMaquina){
                i = 0;
                System.out.println("Contrasena correcta");
            } else {
                System.out.println("Contrasena incorrecta, le quedan " + (i - 1) + " intentos.");
            }
        }
    }
}
