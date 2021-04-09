package Programacion.PruebasBD.ManejoJDBC.datos;

/*
 * Clase Data Access Object
 * Esta clase servirá para usar métodos, donde usaremos la clase de Persona para pasarle parámetros.
 */

import Programacion.PruebasBD.ManejoJDBC.domain.Persona;
import static Programacion.PruebasBD.ManejoJDBC.datos.Conexion.*;
import java.sql.*;
import java.util.*;

public class PersonaDAO {
    //Guardamos las consultas en constantes donde posteriormente se usaran.
    private static final String SQL_SELECT = "SELECT idpersona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE idpersona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idpersona = ?";


    public List<Persona> seleccionar(){
        //Declaramos la conexión el statement y el resultset nulos
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        //Creamos una clase persona nula.
        Persona persona = null;

        //Creamos el arraylist de personas.
        List<Persona> personas = new ArrayList<>();

        try {
            //Importamos los metodos de la clase Conexion de forma estatica, por eso no se necesita
            //poner la clase antes del metodo, aunque no pasa nada si lo ponemos.
            //TAMBIEN PODRIA SER: conn = Conexion.getConnection();
            conn = getConnection();

            //Preparamos para ejecutar la consulta.
            stmt = conn.prepareStatement(SQL_SELECT);

            //Ejecutamos la consulta y la guardamos en el resultset
            rs = stmt.executeQuery();

            while (rs.next()){
                int idPersona = rs.getInt("idpersona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                //Guardamos las iteraciones en diferentes personas para posteriormente meterlas
                //en el arraylist
                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

            //Metemos en el bloque finally los close de resultset, statement y conexion.
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return personas;
    }

    public int insertar(Persona persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            //Estas lineas sustituyen las '?' de las constantes.
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());

            //Guardamos los campos cambiados en la variable registros,
            /*
             * En este caso se ejecuta 'executeUpdate()', a diferencia que en el insert
             * se usó executeQuery(), ya que la base de datos se va a ver afectada, es
             * decir, va a haber cambios.
             */
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(Persona persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int borrar(Persona persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
