package Programacion.Pruebas.ArrayList;

import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> companys = new ArrayList<>();
        companys.add("Gustavo");
        companys.add("Lluc");
        companys.add("Josua");
        companys.add("Adán");
        companys.add("Marcos");
        companys.add("Miguel Ángel");
        for (String company : companys) {
            System.out.println(company + " ");
        }
    }
}
