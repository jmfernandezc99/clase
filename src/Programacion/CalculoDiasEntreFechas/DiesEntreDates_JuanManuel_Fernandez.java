package Programacion.CalculoDiasEntreFechas;/*
Hecho dia mar. 15/12/2020
Creado por: Juanma
Paquete: CalculoDiasEntreFechas
Descripcion:
*/

public class DiesEntreDates_JuanManuel_Fernandez extends CalcularDiesEntreDates {

    int diesMesInicial;
    int diesMesDesti;
    int diesMes;
    int diesResteAnyInicial;
    int diesResteAnyDesti;
    int diesNumAnysComplets;
    boolean anyDeTraspas;

    //Calculamos cuantos dias pertenecen a cada mes.
    @Override
    protected int diesMes(int mes) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                this.diesMes = 31;
                break;
            case 2:
                this.diesMes = 28;
                break;
            case 4: case 6: case 9: case 11:
                this.diesMes = 30;
                break;
        }
        return this.diesMes;
    }

    //Calculamos los dias que faltan para acabar el mes, desde el dia 'dataXS.dia' hasta el dia 30 o 31, segun
    //el mes.
    @Override
    protected int diesMesInicial(DataXS dataXS) {
        this.diesMesInicial = diesMes(dataXS.mes) - dataXS.dia;
        return this.diesMesInicial;
    }

    //Linea 35 pero en el mes del destino, donde calculamos cuantos dias han pasado desde que el mes empezo.
    @Override
    protected int diesMesDesti(DataXS dataXS) {
        this.diesMesDesti = dataXS.dia;
        return this.diesMesDesti;
    }

    //Calculamos los dias que quedan hasta fin de año contando al mes siguiente del que hemos trabajado.
    @Override
    protected int diesResteAnyInicial(DataXS datainicial) {
        datainicial.mes++;
        while (datainicial.mes <= 12){
            this.diesResteAnyInicial += diesMes(datainicial.mes);
            datainicial.mes++;
        }
        return this.diesResteAnyInicial;
    }

    //Linea 50 pero en el mes destino, donde contamos desde que empezo el año hasta el mes anterior donde trabajamos.
    @Override
    protected int diesResteAnyDesti(DataXS datadesti) {
        datadesti.mes--;
        while (datadesti.mes >= 1){
            this.diesResteAnyDesti += diesMes(datadesti.mes);
            datadesti.mes--;
        }
        return this.diesResteAnyDesti;
    }

    //Contamos cuantos años han pasado sumando directamente 365 dias.
    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
        this.diesNumAnysComplets = ((datadesti.any - datainicial.any) -1) * 365;
        return this.diesNumAnysComplets;
    }

    //Calculamos los dias que tenemos que contar de mas de los años bisiestos.
    @Override
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
        int diaBisiesto = 0;
        //Añadimos un dia mas si el mes es enero o febrero y el año le toca ser bisiesto.
        if (datainicial.mes < 03 && anyDeTraspas(datainicial.any)){
            diaBisiesto++;
            for (int i = 0; i <= ((datadesti.any - datainicial.any) -1); i++) {
                if (anyDeTraspas(datainicial.any + i)){
                    diaBisiesto++;
                }
            }
            if (anyDeTraspas(datadesti.any)){
                diaBisiesto++;
            }
        }
        else {
            for (int i = 0; i <= ((datadesti.any - datainicial.any) -1); i++) {
                if (anyDeTraspas(datainicial.any + i)){
                    diaBisiesto++;
                }
            }
            if (anyDeTraspas(datadesti.any)){
                diaBisiesto++;
            }
        }
        return diaBisiesto;
    }

    //Comprobamos si el año es bisiesto.
    @Override
    protected boolean anyDeTraspas(int any) {
        if (any % 400 == 0 || ((any % 4 == 0) && !(any % 100 == 0))){
            this.anyDeTraspas = true;
        }
        else {
            this.anyDeTraspas = false;
        }
        return this.anyDeTraspas;
    }
}
