package Programacion.Ejercicios.AplicacionNominas.Objetos;

public class Nomina {
    private int idTrabajadorNominaCalculada;
    private String nif;
    private String nombreConvenio;
    private String importeTotalAPercibir;

    public Nomina() {
    }

    public Nomina(int idTrabajadorNominaCalculada) {
        this.idTrabajadorNominaCalculada = idTrabajadorNominaCalculada;
    }

    public Nomina(String nif, String nombreConvenio, String importeTotalAPercibir) {
        this.nif = nif;
        this.nombreConvenio = nombreConvenio;
        this.importeTotalAPercibir = importeTotalAPercibir;
    }

    public Nomina(int idTrabajadorNominaCalculada, String nif, String nombreConvenio, String importeTotalAPercibir) {
        this.idTrabajadorNominaCalculada = idTrabajadorNominaCalculada;
        this.nif = nif;
        this.nombreConvenio = nombreConvenio;
        this.importeTotalAPercibir = importeTotalAPercibir;
    }

    public int getIdTrabajadorNominaCalculada() {
        return this.idTrabajadorNominaCalculada;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombreConvenio() {
        return this.nombreConvenio;
    }

    public void setNombreConvenio(String nombreConvenio) {
        this.nombreConvenio = nombreConvenio;
    }

    public String getImporteTotalAPercibir() {
        return this.importeTotalAPercibir;
    }

    public void setImporteTotalAPercibir(String importeTotalAPercibir) {
        this.importeTotalAPercibir = importeTotalAPercibir;
    }

    @Override
    public String toString() {
        String sb = "Nomina{" + "idTrabajadorNominaCalculada=" + idTrabajadorNominaCalculada +
                ", nif='" + this.nif + '\'' +
                ", nombreConvenio='" + this.nombreConvenio + '\'' +
                ", importeTotalAPercibir='" + this.importeTotalAPercibir + '\'' +
                '}';
        return sb;
    }
}
