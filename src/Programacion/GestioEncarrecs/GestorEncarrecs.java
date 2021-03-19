package Programacion.GestioEncarrecs;

import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

public class GestorEncarrecs {
    GestorBD gestor;
    BufferedReader entrada;

    public static void main(String[] args) throws Exception {
        GestorEncarrecs gbd = new GestorEncarrecs();
        gbd.start();
    }

    public GestorEncarrecs() throws Exception{
        gestor = new GestorBD();
        entrada = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start() throws Exception{
        int opcio;
        while (0 !=(opcio = menuPrincipal())){
            try{
                switch (opcio) {
                    case 1 -> cercarClient();
                    case 2 -> afegirClient();
                    case 3 -> cercarProducte();
                    case 4 -> afegirProducte();
                    case 5 -> afegirEncarrec();
                    case 6 -> eliminarEncarrec();
                    case 7 -> cercarEncarrec();
                    default -> mostrarDades("Opció incorrecta\n");
                }
            } catch (Exception ex){
                mostrarDades("S'ha produit un error: " + ex + "\n");
            }
        }
        gestor.tancar();
    }

    private int menuPrincipal() throws Exception {
        String menu = """
                Quina acció vols realitzar?
                [1] Cercar client
                [2] Afegir client
                [3] Llistar tots els productes
                [4] Afegir producte
                [5] Afegir encàrrec
                [6] Eliminar encàrrec
                [7] Consultar encàrrec
                [0] Sortir
                Opció>""";
        String lin = entrarDades(menu);
        try { int opcio = Integer.parseInt(lin); return opcio; }
        catch (Exception ex) { return -1; }
    }

    private String entrarDades(String pregunta) throws IOException {
        mostrarDades(pregunta);
        return entrarDades();
    }

    private String entrarDades() throws IOException {
        String linia = entrada.readLine();
        if ("".equals(linia)) return null;
        return linia;
    }

    private void mostrarDades(String dades) throws IOException {
        System.out.print(dades);
    }

    //Cercar un element d'acord al seu nom
    private void cercarClient() throws Exception {
        String nombre = entrarDades("Introdueix el nom del client: ");
        if (null == nombre) return;
        List<Client> llista = gestor.cercarClient(nombre);
        Iterator it = llista.iterator();
        mostrarDades("Els clients trobats amb aquest nom son:\n−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−\n");
        while(it.hasNext()) {
            Client c = (Client)it.next();
            mostrarDades(c.toString() + "\n");
        }
    }

    //Afegeix un nou client
    public void afegirClient() throws Exception{
        mostrarDades("Introdueix les seguents dades del nou client (deixa en blanc per sortir).\n");
        String nombre = entrarDades("Nom: "); if (null == nombre) return;
        String codigoPostal = entrarDades("Adreça postal: "); if (null == codigoPostal) return;
        String correoElectronico = entrarDades("E-mail: "); if (null == correoElectronico) return;
        String telefono = entrarDades("Telefon: "); if (null == telefono) return;
        int id = gestor.obtenirNouIDClient();
        gestor.afegirClient(new Client(id, nombre, codigoPostal, correoElectronico, telefono));
        mostrarDades("Operació completada satisfactòriament.\n");
    }

    //Afegeix un nou producte.
    public void afegirProducte() throws Exception{
        mostrarDades("Introdueix les seguents dades del nou producte (deixa en blanc per sortir).\n");
        String nombreProducto = entrarDades("Nom: "); if (null == nombreProducto) return;
        String precioString = entrarDades("Preu: "); if (null == precioString) return;
        String cantidadString = entrarDades("Quantitat: "); if (null == cantidadString) return;
        double precio = Double.parseDouble(precioString);
        int cantidad = Integer.parseInt(cantidadString);
        int id = gestor.obtenirNouIDProducte();
        gestor.afegirProducte(new Producte(id, nombreProducto, precio, cantidad));
        mostrarDades("Operació completada satisfactòriament.\n");
    }

    //Mostra tots els productes existents a la base de dades
    private void cercarProducte() throws Exception {
        List<Producte> llista = gestor.cercarProducte();
        Iterator it = llista.iterator();
        mostrarDades("Els productes trobats son:\n−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−\n");
        while(it.hasNext()) {
            Producte c = (Producte) it.next();
            mostrarDades(c.toString() + "\n");
        }
    }

    //Afegeix un nou encàrrec.
    public void afegirEncarrec() throws Exception{
        List<Producte> productes = gestor.cercarProducte();
        mostrarDades("Introdueix dades del nou encarrec (deixa en blac per sortir.)\n");
        int id = gestor.obtenirNouIDEncarrec();
        java.util.Date dataDate = new SimpleDateFormat("yyyy-MM-dd").parse("2020-03-18");
        Timestamp data = new Timestamp(dataDate.getTime());
        int numeroProductes = Integer.parseInt(entrarDades("Numero de productes per aficar dins l'encàrrec: ")); if (0 == numeroProductes) return;
        int idClient = Integer.parseInt(entrarDades("Introdueix el identificador del client: ")); if (0 == idClient) return;
        gestor.afegirEncarrec(new Encarrec(id, data, idClient));
        for (int i = 0; i < numeroProductes; i++) {
            for (Producte p: productes){
                System.out.println(p.toString());
            }
            String nombre = entrarDades("Nom del producte: "); if (null == nombre) return;
            int quantitat = Integer.parseInt(entrarDades("Introdueix la quantitat del producte: ")); if (0 == quantitat) return;
            gestor.updateProducteEncarrec(nombre,quantitat);
            gestor.afegirEncarrecProducte(id, gestor.cercarProducte(nombre).getId(), quantitat);
        }
        mostrarDades("Operació completada satisfactoriament.\n");
    }

    //Elimina un encàrrec a partir del seu ID.
    public void eliminarEncarrec() throws Exception{
        mostrarDades("Introdueix el ID del encàrrec a eliminar (deixa en blanc per sortir).\n");
        String idString = entrarDades("Id: "); if (null == idString) return;
        int id = Integer.parseInt(idString);
        gestor.eliminarEncarrec(id);
        mostrarDades("Operació completada satisfactòriament.\n");
    }

    //Cerca tots els encàrrecs d'un client a partir del seu ID.
    private void cercarEncarrec() throws Exception {
        String idString = entrarDades("Introdueix el id del client per consultar els seus encàrrecs: ");
        int id = Integer.parseInt(idString);
        if (0 == id) return;
        List<Encarrec> llista = gestor.cercarEncarrec(id);
        Iterator it = llista.iterator();
        mostrarDades("Els encàrrecs trobats d'aquest client són:\n−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−\n");
        while(it.hasNext()) {
            Encarrec c = (Encarrec) it.next();
            mostrarDades(c.toString() + "\n");
        }
    }
}