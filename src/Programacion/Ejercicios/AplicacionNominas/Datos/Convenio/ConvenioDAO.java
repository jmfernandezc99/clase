package Programacion.Ejercicios.AplicacionNominas.Datos.Convenio;

import Programacion.Ejercicios.AplicacionNominas.Objetos.Convenio;

import java.sql.*;
import java.util.*;

public interface ConvenioDAO {
    List<Convenio> select() throws SQLException;
}
