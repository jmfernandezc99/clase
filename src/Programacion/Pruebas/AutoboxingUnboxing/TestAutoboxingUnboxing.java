package Programacion.Pruebas.AutoboxingUnboxing;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes de tipos primitivos
        /**
         * int - Integer
         * long - Long
         * float - Float
         * double - Double
         */

        //Ejemplo de autoboxing
        //Podemos convertir datos en distintos tipos de forma mas facil.
        Integer entero = 10;
        System.out.println(entero.doubleValue());

        //Ejemplo de unboxing
        int entero2 = entero;
        //Ya se convierte en primitivo
        System.out.println(entero2);
    }
}
