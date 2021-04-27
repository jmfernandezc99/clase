package Programacion.Ejercicios.AplicacionNominas.Datos.Empresa;

import Programacion.Ejercicios.AplicacionNominas.Objetos.Empresa;

import static Programacion.Ejercicios.AplicacionNominas.Datos.Conexion.*;

import java.sql.*;
import java.util.*;

public class EmpresaDAOImpl implements EmpresaDAO{

    private static final String SQL_SELECT = "SELECT cif, nombreEmpresa, domicilio, ccc FROM Empresa";

    @Override
    public List<Empresa> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Empresa empresa = null;
        List<Empresa> empresas = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()){
                String cif = rs.getString("cif");
                String nombreEmpresa = rs.getString("nombreEmpresa");
                String domicilio = rs.getString("domicilio");
                String ccc = rs.getString("ccc");

                empresa = new Empresa(cif, nombreEmpresa, domicilio, ccc);
                empresas.add(empresa);
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
        return empresas;
    }
}
