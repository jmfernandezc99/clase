package Programacion.Ejercicios.AplicacionNominas.Datos;

import Programacion.Ejercicios.AplicacionNominas.Objetos.Convenio;

import java.sql.SQLException;
import java.util.List;

public interface ConvenioDAO {
    List<Convenio> select() throws SQLException;
}
