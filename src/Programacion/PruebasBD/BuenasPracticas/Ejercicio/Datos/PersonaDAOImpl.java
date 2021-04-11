package Programacion.PruebasBD.BuenasPracticas.Ejercicio.Datos;

import Programacion.PruebasBD.BuenasPracticas.Ejercicio.Datos.PersonaDAO;
import Programacion.PruebasBD.BuenasPracticas.Ejercicio.Objetos.Persona;

import java.sql.*;
import java.util.*;
import Programacion.PruebasBD.BuenasPracticas.Ejercicio.Objetos.Persona;

import static Programacion.PruebasBD.BuenasPracticas.Ejercicio.Datos.Conexion.*;

public class PersonaDAOImpl implements PersonaDAO {

    private static final String SQL_SELECT = "SELECT idpersona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE idpersona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idpersona = ?";

    @Override
    public int insert(Programacion.PruebasBD.BuenasPracticas.Ejercicio.Objetos.Persona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());

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

    @Override
    public int update(Programacion.PruebasBD.BuenasPracticas.Ejercicio.Objetos.Persona persona) {
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

    @Override
    public int delete(Programacion.PruebasBD.BuenasPracticas.Ejercicio.Objetos.Persona persona) {
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

    @Override
    public List<Programacion.PruebasBD.BuenasPracticas.Ejercicio.Objetos.Persona> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Programacion.PruebasBD.BuenasPracticas.Ejercicio.Objetos.Persona persona = null;

        List<Programacion.PruebasBD.BuenasPracticas.Ejercicio.Objetos.Persona> personas = new ArrayList<>();

        try {
            conn = getConnection();

            stmt = conn.prepareStatement(SQL_SELECT);

            rs = stmt.executeQuery();

            while (rs.next()){
                int idPersona = rs.getInt("idpersona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new Programacion.PruebasBD.BuenasPracticas.Ejercicio.Objetos.Persona(idPersona, nombre, apellido, email, telefono);
                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

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
}
