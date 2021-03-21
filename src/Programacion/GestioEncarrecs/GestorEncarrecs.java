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
                    default -> mostrarDades("Opción incorrecta.\n");
                }
            } catch (Exception ex){
                mostrarDades("S'ha produit un error: " + ex + "\n");
            }
        }
        gestor.tancar();
    }

    private int menuPrincipal() throws Exception {
        String menu = """
                Opciones a realizar:
                1.- Buscar cliente.
                2.- Añadir cliente.
                3.- Listar todos los productos.
                4.- Añadir producto.
                5.- Añadir encargo.
                6.- Eliminar encargo.
                7.- Consultar encargo.
                0.- Salir.
                >""";
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

    private void mostrarDades(String dades) {
        System.out.print(dades);
    }

    //Cercar un element d'acord al seu nom
    private void cercarClient() throws Exception {
        String nombre = entrarDades("Introduce el nombre del cliente: "); if (null == nombre) return;
        List<Client> llista = gestor.cercarClient(nombre);
        mostrarDades("Los clientes encontrados con este nombre son:\n");
        mostrarClientes(llista);
    }

    //Afegeix un nou client
    public void afegirClient() throws Exception{
        mostrarDades("Introduce los siguientes datos del cliente (deja en blanco para salir).\n");
        String nombre = entrarDades("Nombre: "); if (null == nombre) return;
        String codigoPostal = entrarDades("Dirección postal: "); if (null == codigoPostal) return;
        String correoElectronico = entrarDades("Correo: "); if (null == correoElectronico) return;
        String telefono = entrarDades("Teléfono: "); if (null == telefono) return;
        int id = gestor.obtenirNouIDClient();
        gestor.afegirClient(new Client(id, nombre, codigoPostal, correoElectronico, telefono));
        mostrarDades("Operación completada de forma correcta.\n");
    }

    //Afegeix un nou producte.
    public void afegirProducte() throws Exception{
        mostrarDades("Introduce los siguientes datos del producto (deja en blanco para salir).\n");
        String nombreProducto = entrarDades("Nombre: "); if (null == nombreProducto) return;
        String precioString = entrarDades("Precio: "); if (null == precioString) return;
        String cantidadString = entrarDades("Cantidad: "); if (null == cantidadString) return;
        double precio = Double.parseDouble(precioString);
        int cantidad = Integer.parseInt(cantidadString);
        int id = gestor.obtenirNouIDProducte();
        gestor.afegirProducte(new Producte(id, nombreProducto, precio, cantidad));
        mostrarDades("Operación completada de forma correcta.\n");
    }

    //Cerca tots els productes existents a la base de dades
    private void cercarProducte() throws Exception {
        List<Producte> llista = gestor.cercarProducte();
        mostrarDades("Los productos encontrados son:\n");
        mostrarProductes(llista);
    }

    //Métode per mostrar per pantalla els productes
    private void mostrarProductes(List llista) {
        System.out.println("ID\tNOMBRE\tPRECIO\tCANTIDAD");
        for (Object o : llista) {
            Producte c = (Producte) o;
            mostrarDades(c.toString() + "\n");
        }
    }

    private void mostrarClientes(List llista) {
        System.out.println("ID\tNOMBRE\tDPOSTAL\tCORREO\t\t\t\tTELEFONO");
        for (Object c : llista) {
            mostrarDades(c.toString() + "\n");
        }
    }

    //Afegeix un nou encàrrec.
    public void afegirEncarrec() throws Exception{
        List<Producte> productes = gestor.cercarProducte();
        int id = gestor.obtenirNouIDEncarrec();
        java.util.Date dataDate = new SimpleDateFormat("yyyy-MM-dd").parse("2020-03-26"); Timestamp data = new Timestamp(dataDate.getTime());
        mostrarProductes(productes);
        int numeroProductes = Integer.parseInt(entrarDades("Numero de productos a añadir al encargo: ")); if (0 == numeroProductes) return;
        List<Client> clientes = gestor.cercarClient();
        mostrarClientes(clientes);
        int idCliente = Integer.parseInt(entrarDades("Introduce el identificador del cliente: ")); if (0 == idCliente) return;
        gestor.afegirEncarrec(new Encarrec(id, data, idCliente));
        for (int i = 0; i < numeroProductes; i++) {
            mostrarProductes(productes);
            String nombre = entrarDades("Nombre del producto: "); if (null == nombre) return;
            int quantitat = Integer.parseInt(entrarDades("Cantidad del producto: ")); if (0 == quantitat) return;
            gestor.updateProducteEncarrec(nombre,quantitat);
            gestor.afegirEncarrecProducte(id, gestor.cercarProducte(nombre).getId(), quantitat);
        }
        mostrarDades("Operación completada de forma correcta.\n");
    }

    //Elimina un encàrrec a partir del seu ID.
    public void eliminarEncarrec() throws Exception{
        mostrarDades("Introduce el identificador del encargo a eliminar (deja en blanco para salir).\n");
        List<Encarrec> llista = gestor.cercarEncarrec();
        mostrarEncargos(llista);
        String idString = entrarDades("Id: "); if (null == idString) return;
        int id = Integer.parseInt(idString);
        gestor.eliminarEncarrec(id);
        mostrarDades("Operación completada de forma correcta.\n");
    }

    //Cerca tots els encàrrecs d'un client a partir del seu ID.
    private void cercarEncarrec() throws Exception {
        String idString = entrarDades("Introduce el identificador del cliente para ver sus encargos: ");
        int id = Integer.parseInt(idString);
        if (0 == id) return;
        List<Encarrec> llista = gestor.cercarEncarrec(id);
        mostrarDades("Los encargos encontrados en este cliente son:\n");
        mostrarEncargosId(llista);
    }

    //Muestra todos los encargos filtrados por id por pantalla
    private void mostrarEncargosId(List llista) {
        System.out.println("ID\tFECHA\t\tID CLIENTE");
        for (Object o : llista) {
            Encarrec c = (Encarrec) o;
            mostrarDades(c.toString() + "\n");
        }
    }

    //Muestra todos los encargos por pantalla
    private void mostrarEncargos(List llista) {
        System.out.println("ID\tFECHA\t\tID CLIENTE");
        for (Object o : llista) {
            Encarrec c = (Encarrec) o;
            mostrarDades(c.toString() + "\n");
        }
    }
}