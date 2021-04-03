package Programacion.Pruebas.ClasesMetodos;/*
Hecho dia mié. 18/11/2020

Creado por: Juanma

Paquete: PracticaMetodos

Descripcion: Un garatge cobra una tarifa mínima de 2,00 dòlars per estacionar fins a tres hores.
El garatge cobra 0,50 dòlars addicionals per hora per cada hora o part d’ella per sobre de tres
hores. El càrrec màxim per a un període de 24 hores és de 10,00 USD. Podem suposar que no hi
haurà cotxes aparcats durant més de 24 hores. Escriviu una aplicació que calculi i mostri les
despeses d’aparcament del garatge. Haureu d'introduir les hores estacionades per a cada client.
El programa hauria de mostrar el càrrec del client actual i ha de calcular i mostrar el total
actual acumulat. Heu de crear el mètode calculateCharges per determinar el càrrec per a cada
client.
*/

import java.util.Scanner;

public class CargasEstacionamiento {
    private int horasEstacionamiento;
    private double precioEstacionamiento;
    private String matricula;

    public CargasEstacionamiento(String matricula){
        this.matricula = matricula;
    }

    public void calculateCharges(int horas){
        this.horasEstacionamiento = horas;

        if (this.horasEstacionamiento >= 19 && this.horasEstacionamiento <= 24){
            this.precioEstacionamiento = 10.00;
        }
        else if (this.horasEstacionamiento > 3 && this.horasEstacionamiento < 19 ){
            this.precioEstacionamiento = ((this.horasEstacionamiento - 3) * 0.50) + 2.00;
        }
        else if (this.horasEstacionamiento <= 3){
            this.precioEstacionamiento = 2.00;
        }
        else if (this.horasEstacionamiento > 24){
            System.out.println("Solo puede estar 24 horas maximo.");
            this.precioEstacionamiento = 0.00;
        }
    }

    public String toStringPrecioEstacionamiento(){
        return getMatricula() + " a pagar " + precioEstacionamiento + " USD.";
    }

    public String getMatricula(){
        return matricula;
    }
}

class TestEstacionamiento {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        CargasEstacionamiento parking1 = new CargasEstacionamiento("1234HJK");
        System.out.println("Introduce las horas aparcadas para el coche " + parking1.getMatricula() + ".");
        int horas = consola.nextInt();
        parking1.calculateCharges(horas);
        System.out.println(parking1.toStringPrecioEstacionamiento());
    }
}
