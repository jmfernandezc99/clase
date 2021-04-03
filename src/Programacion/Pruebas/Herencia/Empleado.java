package Programacion.Pruebas.Herencia;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
    }

    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++Empleado.contadorEmpleado;

    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado= ").append(this.idEmpleado);
        sb.append(", nombre= ").append(this.nombre);
        sb.append(", sueldo= ").append(this.sueldo);
        sb.append('}');
        return sb.toString();
    }
}
