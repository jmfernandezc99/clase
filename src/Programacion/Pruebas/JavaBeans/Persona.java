package Programacion.Pruebas.JavaBeans;

import java.io.Serializable;

//!!!1er paso esta clase debe de ser implementada por 'Serializable'.
public class Persona implements Serializable {
    //!!!2o los atributos deben ser privados.
    private String nombre;
    private String apellido;

    //!!!3o debe tener un constructor vacío y público.
    public Persona(){}

    //Podemos crear más constructores aunque NO sería obligatorio.
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //!!!4o Necesitamos los métodos GETTERS Y SETTERS para los atributos.
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Podemos agregar el método toString aunque NO sería obligatorio.
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
