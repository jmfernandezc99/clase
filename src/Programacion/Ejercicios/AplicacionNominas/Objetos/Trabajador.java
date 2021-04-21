package Programacion.Ejercicios.AplicacionNominas.Objetos;

public class Trabajador {
    private String nif;
    private String nombreTrabajador;
    private String numeroAfiliacion;
    private String puesto;
    private String grupoCotizacion;

    public Trabajador(){

    }

    public Trabajador(String nif, String nombreTrabajador, String numeroAfiliacion, String puesto, String grupoCotizacion) {
        this.nif = nif;
        this.nombreTrabajador = nombreTrabajador;
        this.numeroAfiliacion = numeroAfiliacion;
        this.puesto = puesto;
        this.grupoCotizacion = grupoCotizacion;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombreTrabajador() {
        return this.nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getNumeroAfiliacion() {
        return this.numeroAfiliacion;
    }

    public void setNumeroAfiliacion(String numeroAfiliacion) {
        this.numeroAfiliacion = numeroAfiliacion;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getGrupoCotizacion() {
        return this.grupoCotizacion;
    }

    public void setGrupoCotizacion(String grupoCotizacion) {
        this.grupoCotizacion = grupoCotizacion;
    }

    @Override
    public String toString() {
        String sb = "Trabajador{" + "nif='" + this.nif + '\'' +
                ", nombreTrabajador='" + this.nombreTrabajador + '\'' +
                ", numeroAfiliacion='" + this.numeroAfiliacion + '\'' +
                ", puesto='" + this.puesto + '\'' +
                ", grupoCotizacion='" + this.grupoCotizacion + '\'' +
                '}';
        return sb;
    }
}
