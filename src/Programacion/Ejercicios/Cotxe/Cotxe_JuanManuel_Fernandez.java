package Programacion.Ejercicios.Cotxe;/*
Hecho dia dom. 06/12/2020
Creado por: Juanma
Paquete: ExerciciCotxe
Descripcion:
*/

import java.util.Random;
public class Cotxe_JuanManuel_Fernandez extends CotxeAbstracte {
    //Declaram l'atribut estatCotxe provinent de la classe EstatsMotorCotxe
    protected EstatsMotorCotxe estatCotxe;

    //Cream el constructor de la classe ficant-li els atributs de la classe Cotxe abstracte mes l'atribut de estatCotxe
    public Cotxe_JuanManuel_Fernandez(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatCotxe) {
        //Agafarem el constructor de la classe pare CotxeAbstracte
        super(marca, model, tipuscanvi);
        this.estatCotxe = estatCotxe;
    }

    @Override
    //Crearem el metode arrancar motor dient que si el motor esta aturat, que l'encengui, si no, ens mostrara un
    //missatge dient-mos que ja esta arrancat
    public void arrancarMotor() throws Exception {
        if (estatCotxe == EstatsMotorCotxe.Aturat) {
            this.estatCotxe = EstatsMotorCotxe.EnMarxa;
        } else {
            throw new Exception("Ja esta arrancat");
        }
    }

    @Override
    //Crearem el metode Comprova motor per saber quin es l'estat actual del motor del cotxe, si aturat o en marxa
    public EstatsMotorCotxe comprovaMotor() {
        return this.estatCotxe;
    }

    @Override
    //Crearem el metode get Revolucions on nos dira a quines revolucions esta el nostre cotxe, dient que si el estat
    //esta aturat, les revolucions estiran a 0, pero si esta en marxa, ens fara un numero random entre 0 i 6499 + 1
    //aixo significa que el numero donara entre 1 y 6500
    public int getRevolucions() {
        if (estatCotxe == EstatsMotorCotxe.Aturat) {
            return 0;
        } else {
            Random random = new Random();
            return random.nextInt(6499 + 1);
        }
    }

    @Override
    //Crearem el metode aturar motor on si el cotxe esta aturat, ens mostra un missatge de que ja esta aturat,
    //pero si esta en marxa, l'aturara
    public void aturarMotor() throws Exception {
        if (estatCotxe == EstatsMotorCotxe.Aturat) {
            throw new Exception("Ja esta aturat");
        } else {
            this.estatCotxe = EstatsMotorCotxe.Aturat;
        }
    }
}
