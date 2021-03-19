package Programacion.Condicionales;
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Que dia de la semana quieres consultar? ");
        String diaSemana = consola.nextLine();
        char charSemana = diaSemana.charAt(0);
        switch(charSemana){
            case 'l': case 'm': case 'j':
                System.out.println("Tienes FOL a primera hora");
                break;
            case 'x':
                System.out.println("Tienes PROGRAMACION a primera hora");
                break;
            case 'v':
                System.out.println("Tienes COMPUTER SYSTEMS a primera hora");
                break;
            default:
                System.out.println("No se reconoce ese dia como dia lectivo");
        }
    }
}
