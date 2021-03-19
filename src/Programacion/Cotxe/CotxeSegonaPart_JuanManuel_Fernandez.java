package Programacion.Cotxe;

import java.util.*;

public class CotxeSegonaPart_JuanManuel_Fernandez extends Cotxe_JuanManuel_Fernandez{
    protected Cinturo cinturo;
    protected MarxesAutomatic marxesAutomatic;
    protected MarxesManual marxesManual;

    public CotxeSegonaPart_JuanManuel_Fernandez(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatCotxe, Cinturo cinturo){
        super(marca, model, tipuscanvi, estatCotxe);
        this.cinturo = cinturo;
        if (tipuscanvi == TipusCanvi.CanviManual){
            this.marxesManual = MarxesManual.N;
        } else {
            this.marxesAutomatic = marxesAutomatic.N;
        }
    }

    /*public void canviarMarxaAutomatic(MarxesAutomatic marxa) throws Exception{
        ArrayList<MarxesAutomatic> marxesAutomatic = new ArrayList<>();
        for (int i = 0; i < MarxesAutomatic.values().length; i++) {
            marxesAutomatic.add(MarxesAutomatic.values()[i]);
        }
        if (this.estatCotxe == EstatsMotorCotxe.EnMarxa){
            if (marxesAutomatic.contains(marxa)){
                if (){

                }
            } else {
                throw new Exception("Marxa incorrecta");
            }
        } else {
            throw new Exception("El cotxe està aturat. No pots canviar de marxa");
        }
    }*/

    public void canviarMarxaManual(MarxesManual marxa) throws Exception{

    }

    //Metodo para abrocharnos el cinturon.
    public void fermarCinturo() throws Exception{
        if (this.cinturo == Cinturo.NoFermat){
            this.cinturo = Cinturo.Fermat;
        }
        else {
            throw new Exception("Ja tens el cinturo fermat");
        }
    }

    //getter del cinturon
    public Cinturo getCinturo(){
        return this.cinturo;
    }

    //Metodo para desabrocharnos el cinturon
    public void desfermarCinturo() throws Exception{
        if (this.cinturo == Cinturo.Fermat){
            this.cinturo = Cinturo.NoFermat;
        }
        else {
            throw new Exception("Ja tens el cinturo desfermat");
        }
    }

    //Getter de la marcha manual en la que estamos.
    public MarxesManual getMarxaManual(){
        return this.marxesManual;
    }

    //Getter de la marcha automatica en la que estamos
    public MarxesAutomatic getMarxaAutomatic(){
        return this.marxesAutomatic;
    }
}
