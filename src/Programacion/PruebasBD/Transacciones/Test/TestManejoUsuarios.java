package Programacion.PruebasBD.Transacciones.Test;

import Programacion.PruebasBD.Transacciones.datos.PersonaDAO;
import Programacion.PruebasBD.Transacciones.datos.UsuarioDAO;
import Programacion.PruebasBD.Transacciones.domain.Persona;
import Programacion.PruebasBD.Transacciones.domain.Usuario;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static Programacion.PruebasBD.Transacciones.datos.Conexion.getConnection;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        Connection conexion = null;

        try {
            conexion = getConnection();
            if (conexion.getAutoCommit() == true){
                conexion.setAutoCommit(false);
            }

            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);

            Usuario cambioUsuario = new Usuario(1);
            cambioUsuario.setNombreUsuario("jmfernandezc");
            cambioUsuario.setPassword("123patitoingles");
            usuarioDao.actualizar(cambioUsuario);

            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setNombreUsuario("gmuletf");
            nuevoUsuario.setPassword("inglespatito123");
            usuarioDao.insertar(nuevoUsuario);

            conexion.commit();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
