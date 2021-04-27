package Programacion.Ejercicios.AplicacionNominas.Objetos;

public class Convenio {
    private int idConvenio;
    private String nombreConvenio;
    private int irpf;
    private int contingenciasComunes;
    private int paro;
    private int formacionProfesional;
    private int horasExtraordinarias;
    private int horasExtraordinariasPorFuerzaMayor;
    private int salarioBase;

    public Convenio() {
    }

    public Convenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public Convenio(String nombreConvenio, int irpf, int contingenciasComunes, int paro, int formacionProfesional, int horasExtraordinarias, int horasExtraordinariasPorFuerzaMayor, int salarioBase) {
        this.nombreConvenio = nombreConvenio;
        this.irpf = irpf;
        this.contingenciasComunes = contingenciasComunes;
        this.paro = paro;
        this.formacionProfesional = formacionProfesional;
        this.horasExtraordinarias = horasExtraordinarias;
        this.horasExtraordinariasPorFuerzaMayor = horasExtraordinariasPorFuerzaMayor;
        this.salarioBase = salarioBase;
    }

    public Convenio(int idConvenio, String nombreConvenio, int irpf, int contingenciasComunes, int paro, int formacionProfesional, int horasExtraordinarias, int horasExtraordinariasPorFuerzaMayor, int salarioBase) {
        this.idConvenio = idConvenio;
        this.nombreConvenio = nombreConvenio;
        this.irpf = irpf;
        this.contingenciasComunes = contingenciasComunes;
        this.paro = paro;
        this.formacionProfesional = formacionProfesional;
        this.horasExtraordinarias = horasExtraordinarias;
        this.horasExtraordinariasPorFuerzaMayor = horasExtraordinariasPorFuerzaMayor;
        this.salarioBase = salarioBase;
    }

    public int getIdConvenio() {
        return this.idConvenio;
    }

    public String getNombreConvenio() {
        return this.nombreConvenio;
    }

    public void setNombreConvenio(String nombreConvenio) {
        this.nombreConvenio = nombreConvenio;
    }

    public int getIrpf() {
        return this.irpf;
    }

    public void setIrpf(int irpf) {
        this.irpf = irpf;
    }

    public int getContingenciasComunes() {
        return this.contingenciasComunes;
    }

    public void setContingenciasComunes(int contingenciasComunes) {
        this.contingenciasComunes = contingenciasComunes;
    }

    public int getParo() {
        return this.paro;
    }

    public void setParo(int paro) {
        this.paro = paro;
    }

    public int getFormacionProfesional() {
        return this.formacionProfesional;
    }

    public void setFormacionProfesional(int formacionProfesional) {
        this.formacionProfesional = formacionProfesional;
    }

    public int getHorasExtraordinarias() {
        return this.horasExtraordinarias;
    }

    public void setHorasExtraordinarias(int horasExtraordinarias) {
        this.horasExtraordinarias = horasExtraordinarias;
    }

    public int getHorasExtraordinariasPorFuerzaMayor() {
        return this.horasExtraordinariasPorFuerzaMayor;
    }

    public void setHorasExtraordinariasPorFuerzaMayor(int horasExtraordinariasPorFuerzaMayor) {
        this.horasExtraordinariasPorFuerzaMayor = horasExtraordinariasPorFuerzaMayor;
    }

    public int getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return this.idConvenio + "\t" + this.nombreConvenio + "\t" + this.irpf + "\t" +
                this.contingenciasComunes + "\t" + this.paro + "\t" + this.formacionProfesional + "\t" +
                + this.horasExtraordinarias + "\t" + this.horasExtraordinariasPorFuerzaMayor + "\t" +
                this.salarioBase;
    }
}
