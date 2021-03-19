package Entornos.Nevera;

import java.util.Collection;
import java.util.HashSet;

public class Nevera {
    private final Collection<String> FRUTAS = new HashSet<>();

    public boolean put(String item){
        return FRUTAS.add(item);
    }

    public boolean contains(String item){
        return FRUTAS.contains(item);
    }

    public void take (String item) throws  Exception{
        boolean resultado = FRUTAS.remove(item);
        if (!resultado){
            throw new Exception("El elemento " + item + " no se encuentra en la nevera");
        }
    }
}