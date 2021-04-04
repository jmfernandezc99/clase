package Programacion.Pruebas.MundoPc;

public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        String sb = "Raton{" + "idRaton=" + this.idRaton +
                ", contadorRatones=" + Raton.contadorRatones +
                super.toString() +
                '}';
        return sb;
    }
}
