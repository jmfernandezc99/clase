package Entornos.AdivinaNumero;/*
Hecho dia lun. 14/12/2020
Creado por: Juanma
Paquete: AdivinaNumero
Descripcion: Desarrollo del juego de 5 intentos para adivinar un numero aleatorio elegido por la máquina del 1 al 100.
*/

import java.util.*;
public class JuegoCincoIntentos {
    private int saldoTotal = 20;
    private int saldoJugador = 0;
    final String contrasena = "abc1234";

    //Getters
    public int getSaldoJugador(){
        return this.saldoJugador;
    }

    public String getContrasena(){
        return this.contrasena;
    }

    public String getSaldoTotal(){
        return this.saldoTotal + "€";
    }

    //Método para desplegar menú
    public void menuPrincipal(){
        Scanner consolaMenu = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Jugar.");
        System.out.println("2. Dejar de jugar y retirar ganancias.");
        System.out.println("3. Consultar el saldo ganado (ADMINISTRADOR)");
        System.out.println("4. Apagar consola. (ADMINISTRADOR)");
        int menu = consolaMenu.nextInt();
        switch (menu) {
            case 1 -> introduccionEuro();
            case 2 -> retiradaSaldoJugador();
            case 3 -> gananciasMaquina();
            case 4 -> apagarConsola();
            default -> {
                System.out.println("No ha seleccionado ninguna de las opciones posibles.");
                menuPrincipal();
            }
        }
    }

    //Método para introducir el dinero requerido.
    public void introduccionEuro(){
        Scanner consola = new Scanner(System.in);
        boolean bool = false;
        while (!bool) {
            System.out.println("Introduzca 1€ por favor.");
            int insertarEuro = consola.nextInt();
            if (insertarEuro == 1) {
                bool = true;
            } else {
                System.out.println("No ha introducido la cantidad necesaria.");
            }
        }
        incrementoEuro();
        Jugar();
    }

    //Metodo para incrementar el saldo total + 1
    public void incrementoEuro(){
        this.saldoTotal++;
    }

    //Método del desarrollo del juego.
    public void Jugar(){
        Scanner consola = new Scanner(System.in);
        Random random = new Random();
        int numeroRandom = random.nextInt(99 + 1);
        ArrayList<Integer> intentos = new ArrayList<>();
        boolean bool = true;
        int i = 5;
        //System.out.println(numeroRandom);
        while (bool) {
            System.out.println("Le quedan " + i + " intentos.");
            System.out.println("Introduzca un numero del 1 al 100.");
            int numero = consola.nextInt();
            intentos.add(numero);
            if (i == 1 && numero != numeroRandom){
                System.out.println("Ha perdido la partida.");
                bool = false;
            }
            else {
                if (numero == numeroRandom){
                    System.out.println("Has ganado la partida, enhorabuena!");
                    this.saldoJugador += 5;
                    bool = false;
                }
                else if (numero < numeroRandom){
                    System.out.println("El número es más grande.");
                }
                else{
                    System.out.println("El número es más pequeño");
                }
            }
            i--;
        }
        System.out.println("El numero era " + numeroRandom + "!");
        System.out.print("Sus intentos han sido: ");
        for (Integer intento : intentos) {
            System.out.print(intento + " ");
        }
        System.out.println("\n");
        menuPrincipal();
    }

    //Método para que el jugador pueda retirar su dinero.
    public void retiradaSaldoJugador(){
        Scanner consola = new Scanner(System.in);
        System.out.println("¿Está seguro de que desea retirar sus ganancias? (S/N)");
        String retiro = consola.nextLine();
        if (retiro.equals("S")){
            if (this.saldoJugador > 0) {
                System.out.println(getSaldoJugador());
                System.out.println("Retirando dinero...");
                this.saldoTotal -= this.saldoJugador;
                this.saldoJugador = 0;
            } else {
                System.out.println("Usted no ha tenido ninguna ganancia...");
            }
        }
        menuPrincipal();
    }

    //Método para consultar el saldo de la máquina (se requieren permisos de administrador).
    public void gananciasMaquina(){
        boolean juegoActivo = true;
        for (int i = 3; i > 0 && juegoActivo ; i--) {
            Scanner consola = new Scanner(System.in);
            System.out.println("Introduce la contraseña para consultar las ganancias de hoy.");
            String apagar = consola.nextLine();
            if (apagar.equals(getContrasena())) {
                System.out.println(getSaldoTotal());
                juegoActivo = false;
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        }
        menuPrincipal();
    }

    //Método para apagar la máquina (se necesitan permisos de administrador).
    public void apagarConsola(){
        boolean juegoActivo = true;
        int contador = 3;
        while (juegoActivo && contador > 0){
            Scanner consola = new Scanner(System.in);
            System.out.println("Introduce la contraseña para apagar.");
            String apagar = consola.nextLine();
            if (apagar.equals(getContrasena())) {
                System.out.println("Apagando máquina...");
                juegoActivo = false;
            } else {
                System.out.println("Contraseña incorrecta.");
                contador--;
            }
        }
    }
}
