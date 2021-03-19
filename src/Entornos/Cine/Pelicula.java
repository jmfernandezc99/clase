package Entornos.Cine;

import java.util.*;
public class Pelicula {
    public String titulo;
    public int duracion;
    public int edadMinima;
    public String director;

    /*
    Metemos el constructor que no usaremos por ahora.

    public Pelicula(String titulo, int duracion, int edadMinima, String director){
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }
    */

    public Pelicula(){
        setTitulo();
        setDirector();
        setDuracion();
        setEdadMinima();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setTitulo() {
        Random random = new Random();
        String titulos[] = { "Vengadores: Endgame", "Spider-man: Far from home", "Ant-Man y la Avispa", "Capitan America: El primer vengador"};
        int numRandom = random.nextInt(titulos.length);
        this.titulo = titulos[numRandom];
    }

    public void setDuracion() {
        Random random = new Random();
        int numRandom = random.nextInt(50) + 100;
        this.duracion = numRandom;
    }

    public void setEdadMinima() {
        Random random = new Random();
        int numRandom = random.nextInt(18);
        this.edadMinima = numRandom;
    }

    public void setDirector() {
        Random random = new Random();
        String directores[] = { "Russo Brothers", "Kevin Feige", "Jon Favreau"};
        int numRandom = random.nextInt(directores.length - 1);
        this.director = directores[numRandom];
    }
}
