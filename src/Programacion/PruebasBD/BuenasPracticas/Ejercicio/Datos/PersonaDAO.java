package Programacion.PruebasBD.BuenasPracticas.Ejercicio.Datos;

import Programacion.PruebasBD.BuenasPracticas.Ejercicio.Objetos.Persona;

import java.sql.SQLException;
import java.util.List;

public interface PersonaDAO {

    int insert(Persona persona) throws SQLException;

    int update(Persona persona) throws SQLException;

    int delete(Persona persona) throws SQLException;

    List<Persona> select() throws SQLException;
}
