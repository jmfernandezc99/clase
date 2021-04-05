package Programacion.Pruebas.ConversionObjetos;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Escritor{");
        sb.append("nombre='").append(this.nombre).append('\'');
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", tipoEscritura=").append(this.tipoEscritura);
        sb.append('}');
        return sb.toString();
    }
}
