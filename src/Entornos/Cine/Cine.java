package Entornos.Cine;

import java.util.*;
public class Cine {
    public Pelicula pelicula;
    public int precio;
    public ArrayList asientos;
    private int dineroRecaudado;

    //Creamos el constructor del cine.
    public Cine(Pelicula pelicula, int precio){
        this.pelicula = pelicula;
        this.precio = precio;
    }

    //Getter para obtener el dinero recaudado.
    public int getDineroRecaudado() {
        return this.dineroRecaudado;
    }

    //Método para generar la sala.
    public void generarSala(){
        ArrayList<String> asientos = new ArrayList<>();
        char letra = 'A';
        int numero = 8;
        while (numero > 0){
            int resta = 9;
            while ( letra < 'J'){
                String numeroString = Integer.toString(numero);
                String asiento = numeroString + letra;
                asientos.add(asiento);
                letra++;
            }
            letra -= resta;
            numero--;
        }
        this.asientos = asientos;
    }

    //Método para generar espectadores.
    public void generarEspectador(){
        while (!this.asientos.isEmpty()){
            Espectador espectador = new Espectador();
            ocuparSala(espectador, this.pelicula);
        }
    }

    //Método para ir ocupando la sala con los espectadores.
    public void ocuparSala(Espectador espectador, Pelicula pelicula){
        Random random = new Random();
        if (espectador.getDinero() >= this.precio && espectador.getEdad() >= pelicula.edadMinima){
            int numRandom = random.nextInt(this.asientos.size());
            this.asientos.remove(numRandom);
            this.dineroRecaudado += this.precio;
        }
        generarEspectador();
    }
}
