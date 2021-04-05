package Programacion.Pruebas.ConversionObjetos;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);

        //Convirtiendo referencia del padre al hijo o tambien llamado DOWNCASTING.
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.obtenerDetalles());

        //Convirtiendo referencia del hijo al padre o tambine llamado UPCASTING.
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
