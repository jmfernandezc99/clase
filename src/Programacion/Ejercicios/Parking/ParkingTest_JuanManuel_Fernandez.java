package Programacion.Ejercicios.Parking;

import java.util.Scanner;
public class ParkingTest_JuanManuel_Fernandez {
    public static void main(String[] args) throws Exception {
        //Definimos un objeto tipo Parking_JuanManuel_Fernandez con 100 plazas para no discapacitados y 20 para discapacitados.
        Parking_JuanManuel_Fernandez parking1 = new Parking_JuanManuel_Fernandez(100, 20);
        Scanner consola = new Scanner(System.in);
        Scanner consola2 = new Scanner(System.in);
        boolean bool = true;
        //Este bucle se irá ejecutando hasta que el usuario quiera salir del programa.
        while (bool){
            try {
                System.out.println("1.- Omplir parking a partir de fitxer.*");
                System.out.println("2.- Entrar cotxe.");
                System.out.println("3.- Entrar cotxe discapacitat.");
                System.out.println("4.- Surtir cotxe.");
                System.out.println("5.- Surtir cotxe discapacitat.");
                System.out.println("6.- Guardar llistat de matricules en fitxer.*");
                System.out.println("7.- Sortir.");
                int opcion = consola.nextInt();
                String var;
                //Segun que opcion elijamos le pasaremos por consola información que el programa usará para ejecutar
                //los métodos
                switch (opcion) {
                    case 1 -> {
                        if (args.length == 0){
                            System.out.print("Introdueix una ruta vàlida: ");
                            var = consola2.nextLine();
                            parking1.llegirMatricules(var);
                        } else {
                            parking1.llegirMatricules(args[0]);
                        }
                    }
                    case 2 -> {
                        System.out.print("Introdueix una matrícula vàlida: ");
                        var = consola2.nextLine();
                        System.out.println(parking1.entraCotxe(var));
                    }
                    case 3 -> {
                        System.out.print("Introdueix una matrícula vàlida: ");
                        var = consola2.nextLine();
                        System.out.println(parking1.entraCotxeDiscapacitat(var));
                    }
                    case 4 -> {
                        System.out.print("Introdueix una matrícula vàlida: ");
                        var = consola2.nextLine();
                        parking1.surtCotxe(var);
                    }
                    case 5 -> {
                        System.out.print("Introdueix una matrícula vàlida: ");
                        var = consola2.nextLine();
                        parking1.surtCotxeDiscapacitats(var);
                    }
                    case 6 -> {
                        System.out.print("Indica una ruta per al fitxer: ");
                        var = consola2.nextLine();
                        parking1.guardarMatricules(var);
                    }
                    case 7 -> bool = false;
                    default -> System.out.println("No ha introduit una opció del menú.");
                }
            } catch (Exception e){
                    System.out.println(e.getMessage());
            }
        }
    }
}
