package Programacion.Condicionales;
import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce una hora desde las 0h hasta las 24h");
        int hora = consola.nextInt();
        if (hora >= 6 && hora <= 12){
            System.out.println("Bon dia");
        }
        else if (hora >= 13 && hora <= 19){
            System.out.println("Bones tardes");
        }
        else if (hora >= 20 && hora <= 22){
            System.out.println("Bon vespre");
        }
        else {
            System.out.println("Bona nit");
        }
    }

}
