package Programacion.Pruebas.MundoPc;

public class Computadora {
    private final int idComputadora;
    private static int contadorComputadoras;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;

    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public int getIdComputadora() {
        return this.idComputadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        String sb = "Computadora{" + "idComputadora=" + this.idComputadora +
                ", nombre='" + this.nombre + '\'' +
                ", monitor=" + this.monitor +
                ", teclado=" + this.teclado +
                ", raton=" + this.raton +
                '}';
        return sb;
    }
}
