package Programacion.Condicionales;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce la primera nota: ");
        var nota1 = consola.nextDouble();
        System.out.print("Introduce la segunda nota: ");
        var nota2 = consola.nextDouble();
        System.out.print("Introduce la tercera nota: ");
        var nota3 = consola.nextDouble();
        double resultado = (nota1 + nota2 + nota3) / 3;

        if (resultado >= 0 && resultado < 5){
            System.out.println("Tu nota es de " + resultado + ", INSUFICIENTE");
        }
        else if (resultado >= 5 && resultado < 6){
            System.out.println("Tu nota es de " + resultado + ", SUFICIENTE");
        }
        else if (resultado >= 6 && resultado < 7){
            System.out.println("Tu nota es de " + resultado + ", BIEN");
        }
        else if (resultado >= 7 && resultado < 9){
            System.out.println("Tu nota es de " + resultado + ", NOTABLE");
        }
        else if (resultado >= 9 && resultado <= 10){
            System.out.println("Tu nota es de " + resultado + ", EXCELENTE");
        }
    }
}
