package Programacion.Pruebas.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Stream1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(new File("C:\\Users\\Juanma\\Desktop\\gimcana2021.bin"));

            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}