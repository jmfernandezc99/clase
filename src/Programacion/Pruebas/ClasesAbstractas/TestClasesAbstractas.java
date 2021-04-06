package Programacion.Pruebas.ClasesAbstractas;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo("rectangulo");
        rectangulo1.dibujar();

        //creando rectangulo referenciando a un tipo padre
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
