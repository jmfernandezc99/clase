package Programacion.ClasesMetodos;/*
Hecho dia vie. 20/11/2020
Creado por: Juanma
Paquete: ClasesMetodos

Descripcion: (Números arrodonits) Math.floor es pot utilitzar per arrodonir els valors al nombre enter més proper,
per exemple, y = Math.floor (x + 0,5); arrodonirà el nombre x al nombre enter més proper i assignarà el resultat
a y. Escriviu una aplicació que llegeixi valors double i que utilitzi la sentència anterior per arrodonir cadascun
dels números al nombre enter més proper. Per a cada número processat, mostreu tant el número original com el
número arrodonit.

*/

public class NumerosRedondeados {
    private double numero;
    private double numeroRedondeado;

    public void setNumeroRedondeado(double numero){
        this.numero = numero;
        this.numeroRedondeado = Math.floor(numero + 0.5);
    }

    public double getNumero(){
        return this.numero;
    }

    public double getNumeroRedondeado(){
        return this.numeroRedondeado;
    }
}
class TestNumerosRedondeados {
    public static void main(String[] args) {
        NumerosRedondeados numero1 = new NumerosRedondeados();
        numero1.setNumeroRedondeado(3.45);
        System.out.println(numero1.getNumero());
        System.out.println(numero1.getNumeroRedondeado());
    }
}
