package Programacion.Ejercicios.AplicacionNominas.Datos;

import Programacion.Ejercicios.AplicacionNominas.Objetos.Nomina;

import java.sql.SQLException;
import java.util.List;

public interface NominaDAO {
    List<Nomina> select() throws SQLException;

    int insert(Nomina nomina) throws SQLException;
}
