package Programacion.Pruebas.Interfaces;

public class TestInterfaces {
    public static void main(String[] args) {
        //Usamos una variable de tipo interface y almacenamos las implementaciones.
        IAccesoDatos interface1 = new ImplementacionMySql();
        IAccesoDatos interface2 = new ImplementacionOracle();
        //interface1.insertar();
        //interface2.insertar();

        imprimir(interface1);
        imprimir(interface2);
    }

    public static void imprimir(IAccesoDatos interfaz){
        interfaz.listar();
    }
}
