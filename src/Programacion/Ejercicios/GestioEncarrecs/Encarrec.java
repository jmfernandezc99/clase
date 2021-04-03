package Programacion.Ejercicios.GestioEncarrecs;

public class Encarrec {
    private int id;
    private java.util.Date data;
    private int idclient;

    public Encarrec(int id, java.util.Date data, int idclient){
        this.id = id;
        this.data = data;
        this.idclient = idclient;
    }

    public int getId() { return id; }

    public java.util.Date getData() { return data; }

    public int getIdClient() { return idclient; }

    @Override
    public String toString(){
        return id + "\t" + data + "\t" + idclient;
    }
}
