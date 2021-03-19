package Programacion.Cotxe;/*
Hecho dia dom. 06/12/2020
Creado por: Juanma
Paquete: ExerciciCotxe
Descripcion:
*/

public abstract class CotxeAbstracte implements InterfaceCotxe{
    protected String marca;
    protected String model;
    protected TipusCanvi tipuscanvi;

    public CotxeAbstracte(String marca, String model, TipusCanvi tipuscanvi) {
        this.marca = marca;
        this.model = model;
        this.tipuscanvi = tipuscanvi;
    }
}
