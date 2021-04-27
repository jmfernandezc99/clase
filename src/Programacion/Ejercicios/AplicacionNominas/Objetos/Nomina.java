package Programacion.Ejercicios.AplicacionNominas.Objetos;

import java.sql.Timestamp;
import java.util.Date;

public class Nomina {
    private int idNomina;
    private String nif;
    private java.sql.Date fechaInicio;
    private java.sql.Date fechaFin;
    private int idConvenio;
    private String importeTotalAPercibir;

    public Nomina() {
    }

    public Nomina(int idTrabajadorNominaCalculada) {
        this.idNomina = idTrabajadorNominaCalculada;
    }

    public Nomina(String nif, java.sql.Date fechaInicio, java.sql.Date fechaFin, int idConvenio, String importeTotalAPercibir) {
        this.nif = nif;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idConvenio = idConvenio;
        this.importeTotalAPercibir = importeTotalAPercibir;
    }

    public Nomina(int idNomina, String nif, java.sql.Date fechaInicio, java.sql.Date fechaFin, int idConvenio, String importeTotalAPercibir) {
        this.idNomina = idNomina;
        this.nif = nif;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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

    public java.sql.Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(java.sql.Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public java.sql.Date getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(java.sql.Date fechaFin) {
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
