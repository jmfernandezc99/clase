package Programacion.PruebasBD.ManejoJDBC.Test;

import Programacion.PruebasBD.ManejoJDBC.datos.PersonaDAO;
import Programacion.PruebasBD.ManejoJDBC.domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        /*for (Persona persona: personas){
            System.out.println(persona);
        }*/

        Persona personaNueva = new Persona("Joshua", "Mas", "jmas@nigul.cide.es", "644732354");
        //personaDao.insertar(personaNueva);

        Persona personaActualizada = new Persona(1, "Juanma", "Fernandez", "juanmanuelfernandezcordoba@gmail.com", "727731498");
        //personaDao.actualizar(personaActualizada);

        Persona personaBorrada = new Persona(9);
        //personaDao.borrar(personaBorrada);

        List<Persona> personas = personaDao.seleccionar();
        for (Persona persona: personas){
            System.out.println(persona);
        }
    }
}
