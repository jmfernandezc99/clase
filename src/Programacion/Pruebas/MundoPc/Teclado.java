package Programacion.Pruebas.MundoPc;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(", tipoEntrada=").append(getTipoEntrada());
        sb.append(", marca=").append(getMarca());
        sb.append('}');
        return sb.toString();
    }
}
