package Programacion.Pruebas.ClasesGenericas;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<>(15);
        objetoInt.obtenerTipo();

        ClaseGenerica<String> objetoString = new ClaseGenerica<>("Hola");
        objetoString.obtenerTipo();

        ClaseGenerica<Double> objetoDouble = new ClaseGenerica<>(10.);
        objetoDouble.obtenerTipo();
        System.out.println(objetoDouble.getObjeto());
    }
}
