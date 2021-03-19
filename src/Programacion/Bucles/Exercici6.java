package Programacion.Bucles;
public class Exercici6 {
    public static void main(String[] args) {
        int max = 320;
        int min = 160;
        do {
            System.out.println(max);
            max -= 20;
        } while (max >= min);
    }
}
