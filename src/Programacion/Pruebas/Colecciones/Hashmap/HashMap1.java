package Programacion.Pruebas.Colecciones.Hashmap;

import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        HashMap<String, String> Usuarios = new HashMap<>();
        Usuarios.put("juanma", "1");
        Usuarios.put("adios", "2");
        Usuarios.put("hola", "3");
        int intentos = 3;
        boolean bool = false;
        while (intentos > 0 && !bool) {
            System.out.print("Introduzca el nombre de usuario: ");
            String usuario = consola.nextLine();
            System.out.println("Introduzca a contraseña del usuario " + usuario);
            String contrasena = consola.nextLine();
            for (Map.Entry<String, String> entry:Usuarios.entrySet()) {
                if(usuario.equals(entry.getKey())){
                    if (contrasena.equals(entry.getValue())){
                        bool = true;
                    } else {
                        intentos--;
                    }
                } else {
                    intentos--;
                }
            }
        }
        if (bool){
            System.out.println("Ha accedido al área restringida.");
        } else {
            System.out.println("Lo siento, no tiene acceso.");
        }
    }
}
