package Entornos.Cine;

public class CineTest {
    public static void main(String[] args) {
        //Creamos las variables para la medición del tiempo de ejecución.
        long tiempoInicial, tiempoFinal;
        //Definimos la variable de medición del tiempo inicial.
        tiempoInicial = System.currentTimeMillis();
        //Creamos el objeto pelicula.
        Pelicula pelicula = new Pelicula();
        //Creamos el objeto cine.
        Cine cine = new Cine(pelicula, 5);
        //Creamos la sala del cine.
        cine.generarSala();
        //Generamos los espectadores.
        cine.generarEspectador();
        System.out.println("Dinero recaudado: " + cine.getDineroRecaudado() + "€");
        //Definimos la variable de medición del tiempo inicial.
        tiempoFinal = System.currentTimeMillis();
        System.out.println("La ejecución duró: " + (tiempoFinal - tiempoInicial) + " milisegundos.");
    }
}
