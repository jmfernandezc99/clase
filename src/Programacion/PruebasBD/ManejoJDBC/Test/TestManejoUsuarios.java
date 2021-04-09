package Programacion.PruebasBD.ManejoJDBC.Test;

import Programacion.PruebasBD.ManejoJDBC.datos.UsuarioDAO;
import Programacion.PruebasBD.ManejoJDBC.domain.Usuario;

import java.util.*;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuarioInsertar = new Usuario("jmfernandezc", "1234");
        //usuarioDAO.insertar(usuarioInsertar);

        Usuario usuarioActualizar = new Usuario(1, "jmfernandezc", "4321");
        //usuarioDAO.actualizar(usuarioActualizar);

        Usuario usuarioBorrar = new Usuario(1);
        usuarioDAO.borrar(usuarioBorrar);

        List<Usuario> usuarios = usuarioDAO.seleccionar();
        for (Usuario usuario: usuarios){
            System.out.println(usuario);
        }
    }
}
