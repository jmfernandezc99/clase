package Programacion.Ejercicios.GestioEncarrecs;

public class Producte {
    private int id;
    private String nom;
    private double preu;
    private int quantitat;

    public Producte(int id, String nom, double preu, int quantitat){
        this.id = id;
        this.nom = nom;
        this.preu = preu;
        this.quantitat = quantitat;
    }

    public Producte(String nom, double preu, int quantitat){
        this.nom = nom;
        this.preu = preu;
        this. quantitat = quantitat;
    }

    public int getId() { return id; }

    public String getNom() { return nom; }

    public double getPreu() { return preu; }

    public int getQuantitat() {
        return this.quantitat;
    }

    @Override
    public String toString(){
        return this.id + "\t" + this.nom + "\t" + this.preu + "\t" + this.quantitat;
    }
}
