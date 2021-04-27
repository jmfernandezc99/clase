package Programacion.Ejercicios.AplicacionNominas.Datos.Empresa;

import Programacion.Ejercicios.AplicacionNominas.Objetos.Empresa;

import java.sql.SQLException;
import java.util.List;

public interface EmpresaDAO {
    List<Empresa> select() throws SQLException;
}
