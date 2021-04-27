package Programacion.Ejercicios.AplicacionNominas.Datos.Convenio;

import Programacion.Ejercicios.AplicacionNominas.Objetos.Convenio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static Programacion.Ejercicios.AplicacionNominas.Datos.Conexion.*;

public class ConvenioDAOImpl implements ConvenioDAO{

    private static final String SQL_SELECT = "SELECT idConvenio, nombreConvenio, irpf, contingenciasComunes, " +
            "paro, formacionProfesional, horasExtraordinarias, horasExtraordinariasPorFuerzaMayor, " +
            "salarioBase FROM Convenio";


    @Override
    public List<Convenio> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Convenio convenio = null;
        List<Convenio> convenios = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()){
                int idConvenio = rs.getInt("idConvenio");
                String nombreConvenio = rs.getString("nombreConvenio");
                int irpf = rs.getInt("irpf");
                int contingenciasComunes = rs.getInt("contingenciasComunes");
                int paro = rs.getInt("paro");
                int formacionProfesional = rs.getInt("formacionProfesional");
                int horasExtraordinarias = rs.getInt("horasExtraordinarias");
                int horasExtraordinariasPorFuerzaMayor = rs.getInt("horasExtraordinariasPorFuerzaMayor");
                int salarioBase = rs.getInt("salarioBase");

                convenio = new Convenio(idConvenio, nombreConvenio, irpf, contingenciasComunes, paro, formacionProfesional, horasExtraordinarias, horasExtraordinariasPorFuerzaMayor, salarioBase);
                convenios.add(convenio);
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
        return convenios;
    }
}
