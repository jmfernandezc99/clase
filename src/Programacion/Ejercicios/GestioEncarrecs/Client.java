package Programacion.Ejercicios.GestioEncarrecs;

public class Client {
    private int id;
    private String nom;
    private String apostal;
    private String aelectronica;
    private String telefon;

    public Client(int i, String n, String ap, String ae, String t){
        this.id = i;
        this.nom = n;
        this.apostal = ap;
        this.aelectronica = ae;
        this.telefon = t;
    }

    public int getId() { return id; }

    public String getNom() { return nom; }

    public String getApostal() { return apostal; }

    public String getAelectronica() { return aelectronica; }

    public String getTelefon() { return telefon; }

    @Override
    public String toString(){
        return id + "\t" + nom + "\t" + apostal + "\t" + aelectronica + "\t" + telefon;
    }
}
