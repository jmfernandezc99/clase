package Programacion.PruebasBD.PoolConexion.Ejercicio;

import javax.sql.DataSource;
import java.sql.*;

public class Conexion {
    private static final String JDBC_URL = "jdbc:MySQL://localhost:3306/testcurso";
    private static final String JDBC_USER = "juanma";
    private static final String JDBC_PASSWORD = JDBC_USER;

    //Metodo para obtener la conexion con la base de datos
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    //Metodo para cerrar el ResultSet
    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    //Metodo para cerrar el Statement
    public static void close(Statement smtm) throws SQLException {
        smtm.close();
    }

    //Metodo para cerrar el PreparedStatement
    public static void close(PreparedStatement smtm) throws SQLException {
        smtm.close();
    }

    //Metodo para cerrar la conexion
    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}
