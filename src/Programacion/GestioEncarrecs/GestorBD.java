package Programacion.GestioEncarrecs;

import java.util.*;
import java.sql.*;

public class GestorBD {
    Connection conn;

    public GestorBD() throws Exception{
        String userName = "juanma";
        String password = "juanma";
        String url = "jdbc:MySQL://localhost:3306/gestioencarrecs";
        conn = DriverManager.getConnection (url, userName, password);
    }

    public void tancar() throws Exception{
        conn.close();
    }

    //Método para obtener un nuevo id para una nueva alta de cliente dentro de la base de datos
    public int obtenirNouIDClient() throws Exception{
        //Cercar ID Maxim
        Statement cercaMaxId = conn.createStatement();
        ResultSet r = cercaMaxId.executeQuery("SELECT MAX(ID) FROM CLIENTS");
        if(r.next()) return (1 + r.getInt(1));
        else return 1;
    }

    //Método para buscar un cliente a partir de un nombre
    public List<Client> cercarClient(String nom) throws Exception{
        Statement cerca = conn.createStatement();
        ResultSet r = cerca.executeQuery("SELECT * FROM CLIENTS WHERE NOM = " + "'" + nom + "'");
        LinkedList<Client> llista = new LinkedList<>();
        while (r.next()){
            llista.add(new Client(r.getInt("ID"),r.getString("NOM"),r.getString("APOSTAL"),r.getString("AELECTRONICA"),r.getString("TELEFON")));
        }
        return llista;
    }

    public List<Client> cercarClient() throws Exception{
        Statement cerca = conn.createStatement();
        ResultSet r = cerca.executeQuery("SELECT * FROM CLIENTS");
        LinkedList<Client> llista = new LinkedList<>();
        while (r.next()){
            llista.add(new Client(r.getInt("ID"), r.getString("NOM"), r.getString("APOSTAL"), r.getString("AELECTRONICA"), r.getString("TELEFON")));
        }
        return llista;
    }

    //Método para buscar un producto a partir de un nombre
    public Producte cercarProducte(String nom) throws Exception{
        Statement cerca = conn.createStatement();
        ResultSet r = cerca.executeQuery("SELECT * FROM PRODUCTES WHERE NOM = " + "'" + nom + "'");
        if (!r.next()){
            throw new Exception("El producte no s'ha trobat.");
        }
        return new Producte(r.getInt("ID"),r.getString("NOM"),r.getDouble("PREU"),r.getInt("QUANTITAT"));
    }

    //Método para buscar un encargo a partir del id de un cliente
    public List<Encarrec> cercarEncarrec(int nom) throws Exception{
        Statement cerca = conn.createStatement();
        ResultSet r = cerca.executeQuery("SELECT * FROM ENCARRECS WHERE IDCLIENT = " + "'" + nom + "'");
        LinkedList<Encarrec> llista = new LinkedList<>();
        while (r.next()){
            llista.add(new Encarrec(r.getInt("ID"),r.getDate("DATA"),r.getInt("IDCLIENT")));
        }
        return llista;
    }

    //Método para borrar un encargo a partir de su id
    public List<Encarrec> borrarEncarrec(int nom) throws Exception{
        Statement cerca = conn.createStatement();
        ResultSet r = cerca.executeQuery("DELETE FROM ENCARRECS WHERE ID = " + nom);
        LinkedList<Encarrec> llista = new LinkedList<>();
        while (r.next()){
            llista.remove(new Encarrec(r.getInt("ID"),r.getDate("DATA"),r.getInt("IDCLIENT")));
        }
        return llista;
    }

    //Método para buscar todos los productos
    public List<Producte> cercarProducte() throws Exception{
        Statement cerca = conn.createStatement();
        ResultSet r = cerca.executeQuery("SELECT * FROM PRODUCTES");
        LinkedList<Producte> llista = new LinkedList<>();
        while (r.next()){
            llista.add(new Producte(r.getInt("ID"), r.getString("NOM"), r.getDouble("PREU"), r.getInt("QUANTITAT")));
        }
        return llista;
    }

    public List<Encarrec> cercarEncarrec() throws Exception{
        Statement cerca = conn.createStatement();
        ResultSet r = cerca.executeQuery("SELECT * FROM ENCARRECS");
        LinkedList<Encarrec> llista = new LinkedList<>();
        while (r.next()){
            llista.add(new Encarrec(r.getInt("ID"), r.getDate("DATA"), r.getInt("IDCLIENT")));
        }
        return llista;
    }

    //Método para obtener un nuevo id de productos una vez creamos un nuevo producto
    public int obtenirNouIDProducte() throws Exception{
        Statement cercaMaxId = conn.createStatement();
        ResultSet r = cercaMaxId.executeQuery("SELECT MAX(ID) FROM PRODUCTES");
        if(r.next()) return (1 + r.getInt(1));
        else return 1;
    }

    //Método para obtener un nuevo id de encargo una vez creamos un nuevo encargo
    public int obtenirNouIDEncarrec() throws Exception{
        Statement cercaMaxId = conn.createStatement();
        ResultSet r = cercaMaxId.executeQuery("SELECT MAX(ID) FROM ENCARRECS");
        if(r.next()) return (1 + r.getInt(1));
        else return 1;
    }

    //Método para meter un nuevo producto en la base de datos.
    public void afegirProducte(Producte c) throws Exception{
        Statement update = conn.createStatement();
        String valors = c.getId() + ", '" + c.getNom() + "','" + c.getPreu() + "','" + c.getQuantitat() + "'";
        update.executeUpdate("INSERT INTO PRODUCTES VALUES (" + valors + ")");
    }

    //Método para meter un nuevo cliente en la base de datos.
    public void afegirClient(Client c) throws Exception{
        Statement update = conn.createStatement();
        String valors = c.getId() + ", '" + c.getNom() + "','" + c.getApostal() + "','" + c.getAelectronica() + "','" + c.getTelefon() + "'";
        update.executeUpdate("INSERT INTO CLIENTS VALUES (" + valors + ")");
    }

    //Actualizar la tabla productos para decrementar la cantidad de un producto en específico una vez hemos hecho en encargo.
    public void updateProducteEncarrec(String producte, int quantitat) throws SQLException {
        Statement lliurar = conn.createStatement();
        boolean r = lliurar.execute("UPDATE PRODUCTES SET QUANTITAT = QUANTITAT - '" + quantitat + "' WHERE NOM='" + producte + "'" );
    }

    //Método para meter datos una vez creamos un encargo, cogiendo las claves foráneas y el número de artículos.
    public void afegirEncarrecProducte(int idEncarrec, int idProducte, int numArticles) throws Exception{
        Statement update = conn.createStatement();
        String valors = idEncarrec + "," + idProducte + "," + numArticles;
        update.executeUpdate("INSERT INTO ENCARRECSPRODUCTES VALUES (" + valors + ")");
    }

    //Método para meter un nuevo encargo en la base de datos.
    public void afegirEncarrec(Encarrec c) throws Exception{
        Statement update = conn.createStatement();
        String valors = c.getId() + ", '" + c.getData() + "', " + c.getIdClient();
        update.executeUpdate("INSERT INTO ENCARRECS VALUES (" + valors + ")");
    }

    //Método para eliminar un encargo en la base de datos.
    public void eliminarEncarrec(int id) throws Exception{
        Statement update = conn.createStatement();
        update.executeUpdate("DELETE FROM ENCARRECS WHERE ID = '" + id + "'");
    }
}
