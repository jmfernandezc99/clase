package Programacion.Ejercicios.AplicacionNominas.Datos;

import Programacion.Ejercicios.AplicacionNominas.Objetos.Trabajador;

import java.sql.SQLException;
import java.util.List;

public interface TrabajadorDAO {
    List<Trabajador> select() throws SQLException;
}
