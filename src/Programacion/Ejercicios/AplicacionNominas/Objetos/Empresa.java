package Programacion.Ejercicios.AplicacionNominas.Objetos;

public class Empresa {
    private String cif;
    private String nombreEmpresa;
    private String domicilio;
    private String ccc;

    public Empresa() {
    }

    public Empresa(String cif, String nombreEmpresa, String domicilio, String ccc) {
        this.cif = cif;
        this.nombreEmpresa = nombreEmpresa;
        this.domicilio = domicilio;
        this.ccc = ccc;
    }

    public String getCif() {
        return this.cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCcc() {
        return this.ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    @Override
    public String toString() {
        return this.cif + "\t" + this.nombreEmpresa + "\t" + this.domicilio + "\t" + this.ccc;
    }
}
