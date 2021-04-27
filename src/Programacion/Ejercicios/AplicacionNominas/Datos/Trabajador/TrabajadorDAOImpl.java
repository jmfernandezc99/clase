package Programacion.Ejercicios.AplicacionNominas.Datos.Trabajador;

import Programacion.Ejercicios.AplicacionNominas.Objetos.Trabajador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static Programacion.Ejercicios.AplicacionNominas.Datos.Conexion.close;
import static Programacion.Ejercicios.AplicacionNominas.Datos.Conexion.getConnection;

public class TrabajadorDAOImpl implements TrabajadorDAO{

    private static final String SQL_SELECT = "SELECT nif, nombreTrabajador, numeroAfiliacion, puesto, grupoCotizacion" +
            " FROM Trabajador";

    @Override
    public List<Trabajador> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Trabajador trabajador = null;
        List<Trabajador> trabajadores = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()){
                String nif = rs.getString("nif");
                String nombreTrabajador = rs.getString("nombreTrabajador");
                String numeroAfiliacion = rs.getString("numeroAfiliacion");
                String puesto = rs.getString("puesto");
                String grupoCotizacion = rs.getString("grupoCotizacion");

                trabajador = new Trabajador(nif, nombreTrabajador, numeroAfiliacion, puesto, grupoCotizacion);
                trabajadores.add(trabajador);
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
        return trabajadores;
    }
}
