package Programacion.PruebasBD.ConexionTest1;

/*
 * Clase test para probar conexion con base de datos y demas.
 */

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        //Url para conectarnos a la base de datos con jdbc
        String url = "jdbc:MySQL://localhost:3306/testcurso";

        //Nombre de usuario para entrar en la conexion
        String username = "juanma";

        //contraseña para entrar en la conexion
        String password = username;
        try {
            //Especificamos la clase con la que vamos a trabajar con mysql (ES OPCIONAL)
            Class.forName("com.mysql.cj.jdbc.Driver");

            //conexion a la base de datos pasandole las variables url, username y password
            Connection conexion = DriverManager.getConnection(url, username, password);

            /*
             * Objeto de tipo Statement:
             * Este objeto nos permite ejecutar sentencias sobre nuestra tabla en la base de datos.
             *
             * TAMBIEN SE USA LOS OBJETOS 'PreparedStatement' estos se usaran en las clases para
             * hacer metodos.
             */
            Statement instruccion = conexion.createStatement();

            //Variable que contiene la consulta a hacer
            String sql = "SELECT * FROM persona";

            /*
             * Objeto de tipo Interface ResultSet:
             * Guarda el resultado de la consulta ejecutada, cogiendo Statement instruccion y ejecutando
             * la consulta creada anteriormente.
             */
            ResultSet resultado = instruccion.executeQuery(sql);

            //resultado.next itera resultados hasta que sea nulo, que parará el bucle.
            while (resultado.next()){
                System.out.print("idPersona = " + resultado.getInt("idpersona") + ";");
                System.out.print(" Nombre = " + resultado.getString("nombre") + ";");
                System.out.print(" Apellido = " + resultado.getString("apellido") + ";");
                System.out.print(" Email = " + resultado.getString("email") + ";");
                System.out.print(" Telefono = " + resultado.getString("telefono") + "\n");
            }

            /*
             * CERRAMOS EL ResultSet, Statement y Conection OBLIGATORIAMENTE.
             */
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
