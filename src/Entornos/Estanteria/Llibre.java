package Entornos.Estanteria;

public class Llibre {
    public String titulo;
    public String autor;
    public int cualificacion;

    public Llibre(String titulo, String autor, int cualificacion){
        this.titulo = titulo;
        this.autor = autor;
        this.cualificacion = cualificacion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCualificacion() {
        return this.cualificacion;
    }

    public void setCualificacion(int cualificacion) {
        this.cualificacion = cualificacion;
    }
}
