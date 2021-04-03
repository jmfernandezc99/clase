package Programacion.Pruebas.Condicionales;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Indica el dia que naciste: ");
        int dia = consola.nextInt();
        System.out.print("Indica el mes que naciste en numeros: ");
        int mes = consola.nextInt();
        if (dia >= 1 && dia <= 20 && mes == 1 || dia >= 22 && dia <= 31 && mes == 12){
            System.out.println("Tu cumpleaños es el " + dia + "/" + mes + ", eres Capricornio");
        }
        else if (dia >= 1 && dia <= 19 && mes == 2 || dia >= 21 && dia <= 31 && mes == 1){
            System.out.println("Tu cumpleaños es el " + dia + "/" + mes + ", eres Acuario");
        }
        else if (dia >= 1 && dia <= 20 && mes == 3 || dia >= 20 && dia <= 29 && mes == 2){
            System.out.println("Tu cumpleaños es el " + dia + "/" + mes + ", eres Piscis");
        }
        else if (dia >= 1 && dia <= 20 && mes == 4 || dia >= 21 && dia <= 31 && mes == 3){
            System.out.println("Tu cumpleaños es el " + dia + "/" + mes + ", eres Aries");
        }
        else if (dia >= 1 && dia <= 21 && mes == 5 || dia >= 21 && dia <= 30 && mes == 4){
            System.out.println("Tu cumpleaños es el " + dia + "/" + mes + ", eres Tauro");
        }
        else if (dia >= 1 && dia <= 21 && mes == 6 || dia >= 22 && dia <= 31 && mes == 5){
            System.out.println("Tu cumpleaños es el " + dia + "/" + mes + ", eres Geminis");
        }
        else if (dia >= 1 && dia <= 23 && mes == 7 || dia >= 22 && dia <= 30 && mes == 6){
            System.out.println("Tu cumpleaños es el " + dia + "/" + mes + ", eres Cancer");
        }
        else if (dia >= 1 && dia <= 23 && mes == 8 || dia >= 24 && dia <= 31 && mes == 7){
            System.out.println("Tu cumpleaños es el " + dia + "/" + mes + ", eres Leo");
        }
        else if (dia >= 1 && dia <= 23 && mes == 9 || dia >= 24 && dia <= 31 && mes == 8){
            System.out.println("Tu cumpleaños es el " + dia + "/" + mes + ", eres Virgo");
        }
        else if (dia >= 1 && dia <= 23 && mes == 10 || dia >= 24 && dia <= 30 && mes == 9){
            System.out.println("Tu cumpleaños es el " + dia + "/" + mes + ", eres Libra");
        }
        else if (dia >= 1 && dia <= 22 && mes == 11 || dia >= 24 && dia <= 31 && mes == 10){
            System.out.println("Tu cumpleaños es el " + dia + "/" + mes + ", eres Escorpio");
        }
        else if (dia >= 1 && dia <= 21 && mes == 12 || dia >= 23 && dia <= 30 && mes == 11){
            System.out.println("Tu cumpleaños es el " + dia + "/" + mes + ", eres Sagitario");
        }
        else {
            System.out.println("Fecha no reconocida.");
        }
    }
}
