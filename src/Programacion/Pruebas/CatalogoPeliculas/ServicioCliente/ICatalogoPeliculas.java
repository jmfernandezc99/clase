package Programacion.Pruebas.CatalogoPeliculas.ServicioCliente;

/**
 * Interface para definir los metodos del catalogo de las peliculas que se implementará
 * posteriormente en la clase 'CatalogoPeliculas.java'.
 */
public interface ICatalogoPeliculas {

    String NOMBRE_ARCHIVO = "C:\\Users\\Juanma\\IdeaProjects\\Clase\\src\\Programacion\\Pruebas\\CatalogoPeliculas\\peliculas.txt";

    void agregarPelicula(String nombrePelicula) throws Exception;

    void listarPeliculas();

    void buscarPelicula(String buscar) throws Exception;

    void iniciarCatalogoPeliculas() throws Exception;
}
