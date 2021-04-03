package Programacion.Ejercicios.CalculoDiasEntreFechas;/*
Hecho dia mié. 16/12/2020
Creado por: Juanma
Paquete: CalculoDiasEntreFechas
Descripcion:
*/

public class DiesEntreDatesTest {
    public static void main(String[] args) {
        try {
            DiesEntreDates_JuanManuel_Fernandez d1 = new DiesEntreDates_JuanManuel_Fernandez();
            DataXS fechaInicial = new DataXS("01/01/2000");
            DataXS fechaDestino = new DataXS("21/12/2021");
            System.out.println("Han pasado " + d1.nombreDiesTotals(fechaInicial, fechaDestino) + " dias.");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
