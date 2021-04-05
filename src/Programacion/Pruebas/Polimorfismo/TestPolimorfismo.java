package Programacion.Pruebas.Polimorfismo;

import Programacion.Pruebas.Sobreescritura.Empleado;
import Programacion.Pruebas.Sobreescritura.Gerente;

public class TestPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        //System.out.println("empleado = " + empleado.obtenerDetalles());

        imprimir(empleado);

        Gerente gerente = new Gerente("Gustavo", 4000, "Programacion");
        //System.out.println("gerente = " + gerente.obtenerDetalles());

        imprimir(gerente);
    }

    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
