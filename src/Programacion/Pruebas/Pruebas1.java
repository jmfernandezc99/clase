package Programacion.Pruebas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.util.regex.Pattern;

public class Pruebas1 {
    public static void main(String[] args) {
        BufferedWriter bw;
        BufferedReader br;
        String modo = "leer";

        try {
            if (modo.equals("leer")){
                br = new BufferedReader(new FileReader("prueba.txt"));
            } else {
                bw = new BufferedWriter(new FileWriter("prueba.txt"));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
