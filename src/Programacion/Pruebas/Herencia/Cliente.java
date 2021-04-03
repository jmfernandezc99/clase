package Programacion.Pruebas.Herencia;

import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    static private int contadorCliente;
    private Date fechaRegistro = new Date();
    private boolean vip;

    public Cliente(){
        this.idCliente = ++contadorCliente;
    }

    public Cliente(String nombre, char genero, int edad, String direccion, boolean vip) {
        this();
        //El super ya no puede usarse llamando a otro constructor
        //super(nombre, genero, edad, direccion);
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + this.idCliente +
                ", fechaRegistro=" + this.fechaRegistro +
                ", vip=" + this.vip +
                ", nombre='" + this.nombre + '\'' +
                ", genero=" + this.genero +
                ", edad=" + this.edad +
                ", direccion='" + this.direccion + '\'' +
                '}';
    }
}
