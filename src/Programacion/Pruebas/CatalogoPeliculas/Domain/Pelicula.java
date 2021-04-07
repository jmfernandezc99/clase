package Programacion.Pruebas.CatalogoPeliculas.Domain;

/**
 * Clase pelicula para identificar las peliculas como objetos.
 */

public class Pelicula {
    //atributos
    private String nombre;

    //constructores
    public Pelicula(){}
    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    //getter
    public String getNombre() {
        return this.nombre;
    }

    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //toString
    @Override
    public String toString() {
        return this.nombre;
    }
}
