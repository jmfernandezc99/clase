package Entornos.Estanteria;

import java.util.*;

public class Estanteria {

    public ArrayList<Llibre> conjuntoLibros = new ArrayList<>();
    public ArrayList<Llibre> conjuntoLibrosCopia = new ArrayList<>();

    public Estanteria() {

    }

    public void afegirLlibre(Llibre libro) throws Exception{
        if(this.conjuntoLibros.size() < 10){
            if (!this.conjuntoLibros.contains(libro)){
                this.conjuntoLibros.add(libro);
            } else {
                throw new Exception("El libro ya está en la estantería");
            }
        } else {
            throw new Exception("Estantería llena.");
        }
    }

    public void eliminarLlibre(String libro) throws Exception{
        int i;
        boolean salir = false;
        for (i = 0; i <= this.conjuntoLibros.size() && !salir; i++) {
            if (libro.equals(this.conjuntoLibros.get(i).getAutor())){
                this.conjuntoLibros.remove(i);
                salir = true;
            } else if (libro.equals(this.conjuntoLibros.get(i).getTitulo())){
                this.conjuntoLibros.remove(i);
                salir = true;
            }
        }
        if (i == this.conjuntoLibros.size() + 1) {
            throw new Exception("El autor o el título no pertenecen a ningún libro de la estantería.");
        }
    }

    public void topDiez(){
        this.conjuntoLibrosCopia = (ArrayList) conjuntoLibros.clone();
        Collections.sort(this.conjuntoLibrosCopia, Comparator.comparing(Llibre::getCualificacion));
        Collections.reverse(this.conjuntoLibrosCopia);
        System.out.println("Top 10");
        System.out.println("TÍTULO\tAUTOR\tCUALIFICACIÓN");
        for (int i = 0; i < this.conjuntoLibrosCopia.size() ; i++) {
            System.out.println(this.conjuntoLibrosCopia.get(i).getTitulo() + "\t"+ this.conjuntoLibrosCopia.get(i).getAutor() + "\t" + this.conjuntoLibrosCopia.get(i).getCualificacion());
        }
    }

    public void veureEstanteria(){
        System.out.println("TÍTULO\tAUTOR\tCUALIFICACIÓN");
        for (int i = 0; i < conjuntoLibros.size(); i++) {
            System.out.println(conjuntoLibros.get(i).getTitulo() + "\t" + conjuntoLibros.get(i).getAutor() + "\t" + conjuntoLibros.get(i).getCualificacion());
        }
    }
}