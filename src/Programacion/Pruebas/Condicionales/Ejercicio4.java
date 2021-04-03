package Programacion.Pruebas.Condicionales;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Calculadora de sueldo semanal");
        System.out.println("Introduce las horas trabajadas esta semana: ");
        int horas = consola.nextInt();
        if (horas >= 0 && horas <= 40){
            System.out.println("Cobraras " + (horas * 12) + "€.");
        }
        else if (horas > 40){
            int horasExtra = (horas - 40);
            horas = horas - horasExtra;
            System.out.println("Cobraras " + ((horas * 12) + (horasExtra * 16)) + "€.");
        }
    }
}
