package Programacion.ClasesMetodos;/*
Hecho dia vie. 20/11/2020
Creado por: Juanma
Paquete: ClasesMetodos
Descripcion:
*/

import java.util.*;
public class NumerosRedondeados2 {
    private double numero;
    private double numeroIntegro;
    private double numeroDecenas;
    private double numeroCentenas;
    private double numeroMelesimas;

    public NumerosRedondeados2(){

    }

    public NumerosRedondeados2(double numero){
        this.numero = numero;
    }

    public void roundToInteger(double numero){
        this.numero = numero;
        this.numeroIntegro = Math.floor(this.numero * 1 + 0.5) / 1;
    }

    public void roundToTenths(double numero){
        this.numero = numero;
        this.numeroDecenas = Math.floor(this.numero * 10 + 0.5) / 10;
    }

    public void roundToHundredths(double numero){
        this.numero = numero;
        this.numeroCentenas = Math.floor(this.numero * 100 + 0.5) / 100;
    }

    public void roundToThousandhs(double numero){
        this.numero = numero;
        this.numeroMelesimas = Math.floor(this.numero * 1000 + 0.5) / 1000;
    }

    public double getRoundToInteger(){
        return this.numeroIntegro;
    }

    public double getRoundToTenths(){
        return this.numeroDecenas;
    }

    public double getRoundToHundredths(){
        return this.numeroCentenas;
    }

    public double getRoundToThousandhs(){
        return this.numeroMelesimas;
    }
}

class TestNumeroRedondeados2{
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double numero = consola.nextDouble();
        NumerosRedondeados2 numero1 = new NumerosRedondeados2();
        numero1.roundToInteger(numero);
        numero1.roundToTenths(numero);
        numero1.roundToHundredths(numero);
        numero1.roundToThousandhs(numero);
        System.out.println(numero1.getRoundToInteger());
        System.out.println(numero1.getRoundToTenths());
        System.out.println(numero1.getRoundToHundredths());
        System.out.println(numero1.getRoundToThousandhs());
    }
}
