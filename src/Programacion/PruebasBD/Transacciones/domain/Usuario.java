package Programacion.PruebasBD.Transacciones.domain;

/*
 * Clase usuario para identificar los usuarios
 */

public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String password;

    public Usuario(){}

    public Usuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public Usuario(String nombreUsuario, String password){
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public Usuario(int idUsuario, String nombreUsuario, String password){
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        String sb = "Usuario{" + "idUsuario=" + idUsuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", password='" + password + '\'' +
                '}';
        return sb;
    }
}
