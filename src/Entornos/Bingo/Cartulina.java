package Entornos.Bingo;

import java.util.ArrayList;
import java.util.Random;

public class Cartulina {
    public ArrayList<Integer> cartulina = new ArrayList<>();

    public Cartulina(){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int numRandom = random.nextInt(90) + 1;
            this.cartulina.add(numRandom);
        }
    }
}
