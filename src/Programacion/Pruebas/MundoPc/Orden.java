package Programacion.Pruebas.MundoPc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final int MAX_COMPUTADORAS;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.MAX_COMPUTADORAS = 10;
        this.computadoras = new Computadora[this.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < this.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Ya ha llegado al límite máximo.");
        }
    }

    public void mostrarOrden(){
        System.out.println("Orden #: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
