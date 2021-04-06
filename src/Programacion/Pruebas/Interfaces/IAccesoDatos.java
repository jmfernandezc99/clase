package Programacion.Pruebas.Interfaces;

public interface IAccesoDatos {
    /**
     * Los atributos en las interfaces son publicos, estáticos,
     * finales y int, trabajamos con constantes.
     * Por lo tanto los atributos deben ser inicializados a la hora
     * de declararlos.
     */

    int MAX_REGISTRO = 10;

    void insertar();
    void listar();
    void actualizar();
    void eliminar();
}
