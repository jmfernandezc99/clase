package Programacion.Ejercicios.AplicacionNominas.Objetos;

import java.util.Date;

public class Nomina {
    private int idNomina;
    private String nif;
    private Date fechaInicio;
    private Date fechaFin;
    private int idConvenio;
    private String importeTotalAPercibir;

    public Nomina() {
    }

    public Nomina(int idTrabajadorNominaCalculada) {
        this.idNomina = idTrabajadorNominaCalculada;
    }

    public Nomina(String nif, int idConvenio, String importeTotalAPercibir) {
        this.nif = nif;
        this.idConvenio = idConvenio;
        this.importeTotalAPercibir = importeTotalAPercibir;
    }

    public Nomina(int idTrabajadorNominaCalculada, String nif, int idConvenio, String importeTotalAPercibir) {
        this.idNomina = idTrabajadorNominaCalculada;
        this.nif = nif;
        this.idConvenio = idConvenio;
        this.importeTotalAPercibir = importeTotalAPercibir;
    }

    public int getIdNomina() {
        return this.idNomina;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getIdConvenio() {
        return this.idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public String getImporteTotalAPercibir() {
        return this.importeTotalAPercibir;
    }

    public void setImporteTotalAPercibir(String importeTotalAPercibir) {
        this.importeTotalAPercibir = importeTotalAPercibir;
    }

    @Override
    public String toString() {
        return this.idNomina + "\t" + this.nif + "\t" + this.fechaInicio + "\t" +
                this.fechaFin + "\t" + this.idConvenio + "\t" + this.importeTotalAPercibir;
    }
}
