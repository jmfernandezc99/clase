package Programacion.Pruebas.Condicionales;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        //Creamos la variable consola de tipo Scanner para introducir contenido de variable por consola
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        //Creamos variable nota1 de tipo double para introducir por consola la nota del primer examen
        double nota1 = consola.nextDouble();
        System.out.print("Introduce la nota del segundo examen: ");
        //Item con la segunda nota
        double nota2 = consola.nextDouble();
        //Calculamos la media de los dos examenes
        double notaMedia = nota1 * 0.40 + nota2 * 0.60;
        //Si la nota media es mayor o igual que 5...
        if (notaMedia >= 5){
            System.out.println("La nota de programacion es: " + notaMedia);
        }
        //Sino... (nota media menor que 5)
        else {
            Scanner consola1 = new Scanner(System.in);
            System.out.print("Resultado de la recuperacion? (apto/no apto): ");
            //Crearemos la variable recuperacion de tipo string para solo poner apto o no apto
            String recuperacion = consola1.nextLine();
            //Si el string de recuperacion es igual a apto...
            if (recuperacion.equals("apto")){
                System.out.println("La nota de programacion es: " + 5);
            }
            //Si el string de recuperacion es igual a no apto...
            else if (recuperacion.equals("no apto")){
                System.out.println("La nota de programacion es: " + notaMedia);
            }
        }
    }
}
