package Programacion.Pruebas.MundoPc;

public class TestMundoPc {
    public static void main(String[] args) {
        Raton raton1 = new Raton("usb", "acer");
        Teclado teclado1 = new Teclado("usb", "hp");
        Monitor monitor1 = new Monitor("asus", 10);
        Computadora computadora1 = new Computadora("Huawei Matebook D", monitor1, teclado1, raton1);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
    }
}
