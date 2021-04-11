package Programacion.PruebasBD.Transacciones.Test;

import static Programacion.PruebasBD.Transacciones.datos.Conexion.*;

import Programacion.PruebasBD.Transacciones.domain.Persona;
import Programacion.PruebasBD.Transacciones.datos.*;
import java.sql.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        Connection conexion = null;

        try {
            conexion = getConnection();
            if (conexion.getAutoCommit() == true){
                conexion.setAutoCommit(false);
            }

            PersonaDAO personaDao = new PersonaDAO(conexion);

            Persona cambioPersona = new Persona(1);
            cambioPersona.setNombre("Juan Manuel");
            cambioPersona.setApellido("Fernandez");
            cambioPersona.setEmail("jmfernandezc99@gmail.com");
            cambioPersona.setTelefono("727731498");
            personaDao.actualizar(cambioPersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Raul");
            nuevaPersona.setApellido("Madrigal");
            nuevaPersona.setEmail("raulmadrigal7@gmail.com");
            personaDao.insertar(nuevaPersona);

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
