package Entornos.Cine;

import java.util.*;
public class Espectador {
    private int edad;
    private int dinero;

    /*
    Metemos constructor que no usaremos por ahora.

    public Espectador(int edad, int dinero){
        this.edad = edad;
        this.dinero = dinero;
    }
    */

    public Espectador(){
        setDinero();
        setEdad();
    }

    public int getEdad() {
        return edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setEdad() {
        Random random = new Random();
        this.edad = random.nextInt(100);
    }

    public void setDinero() {
        Random random = new Random();
        this.dinero = random.nextInt(20);
    }
}
