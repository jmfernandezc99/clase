package Programacion.Ejercicios.AplicacionNominas.Datos.Nomina;

import Programacion.Ejercicios.AplicacionNominas.Objetos.Nomina;

import java.sql.*;
import java.util.*;

import static Programacion.Ejercicios.AplicacionNominas.Datos.Conexion.*;

public class NominaDAOImpl implements NominaDAO{

    private static final String SQL_SELECT = "SELECT idNomina, nif, fechaInicio, fechaFin, idConvenio, importeTotalAPercibir " +
            "FROM Nomina";
    private static final String SQL_INSERT = "INSERT INTO Nomina(idNomina, nif, fechaInicio, fechaFin, idConvenio " +
            "importeTotalAPercibir) VALUES (?, ?, ?, ?, ?, ?)";

    @Override
    public List<Nomina> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Nomina nomina = null;
        List<Nomina> nominas = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()){
                int idNomina = rs.getInt("idNomina");
                String nif = rs.getString("nif");
                java.sql.Date fechaInicio = rs.getDate("fechaInicio");
                java.sql.Date fechaFin = rs.getDate("fechaFin");
                int idConvenio = rs.getInt("idConvenio");
                String importeTotalAPercibir = rs.getString("importeTotalAPercibir");

                nomina = new Nomina(idNomina, nif, fechaInicio, fechaFin, idConvenio, importeTotalAPercibir);
                nominas.add(nomina);
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
        return nominas;
    }

    @Override
    public int insert(Nomina nomina) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, nomina.getNif());
            stmt.setDate(2, nomina.getFechaInicio());
            stmt.setDate(3, nomina.getFechaFin());
            stmt.setInt(4, nomina.getIdConvenio());
            stmt.setString(5, nomina.getImporteTotalAPercibir());

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
