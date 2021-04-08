package Programacion.Pruebas.CatalogoPeliculas.ServicioCliente;

/*
 * Interface para definir los metodos del catalogo de las peliculas que se implementará
 * posteriormente en la clase 'CatalogoPeliculas.java'.
 */

public interface ICatalogoPeliculas {

    //Constante para almacenar la ruta y nombre del archivo a tratar
    String NOMBRE_ARCHIVO = "C:\\Users\\Juanma\\IdeaProjects\\Clase\\src\\Programacion\\Pruebas\\CatalogoPeliculas\\peliculas.txt";

    //Metodo para agregar un pelicula
    void agregarPelicula(String nombrePelicula) throws Exception;

    //Metodo para listar las peliculas
    void listarPeliculas();

    //Metodo para buscar una pelicula
    void buscarPelicula(String buscar) throws Exception;

    //Metodo para iniciar el catalogo de las peliculas
    void iniciarCatalogoPeliculas() throws Exception;
}
