package Programacion.Pruebas.Matrices;

public class Matrices {
    public static void main(String[] args) {
        //Primero filas y después columnas
        int edades[][] = new int[3][2];

        //Crear matrices directamente
        String frutas[][] = {{"Naranja", "Limón"}, {"Pera", "Manzana"}};

        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println(frutas[i][j]);
            }
        }

        int contador = 1;
        //edades.length ahora recorre las filas!!!!
        for (int i = 0; i < edades.length; i++) {
            //edades[i].length recorre las columnas!!!!
            for (int j = 0; j < edades[i].length; j++) {
                edades[i][j] = contador;
                System.out.println(edades[i][j]);
                contador++;
            }
        }
    }
}
