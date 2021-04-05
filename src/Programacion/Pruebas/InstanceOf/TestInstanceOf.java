package Programacion.Pruebas.InstanceOf;

import Programacion.Pruebas.Sobreescritura.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);

        empleado = new Gerente("Paco", 4000, "Informatica");
        determinarTipo(empleado);

    }

    public static void determinarTipo(Empleado empleado){
        if (empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente.");
        } else if (empleado instanceof Empleado) {
            System.out.println("Era de tipo Empleado.");
            //Gerente empleadoGerente = (Gerente)empleado;
            //((Gerente) empleado).getDepartamento();
        }
    }
}
