package Entornos.Bingo;

import java.util.*;

public class Bingo {
    public ArrayList<Integer> bingo = new ArrayList<>();

    public Bingo(){
        for (int i = 1; i < 100; i++) {
            this.bingo.add(i);
        }
    }

    public void jugarBingo(Cartulina cartulina1, Cartulina cartulina2){
        boolean salir = false;
        for (int i = 1; !salir; i++) {
            Random random = new Random();
            int numRandom = random.nextInt(98 + 1) - i;
            if (cartulina1.cartulina.contains(this.bingo.get(numRandom))){
                cartulina1.cartulina.remove((Integer) numRandom);
            } else if (cartulina2.cartulina.contains(this.bingo.get(numRandom))){
                cartulina2.cartulina.remove((Integer) numRandom);
            }
            this.bingo.remove(numRandom);
            if (cartulina1.cartulina.size() == 0){
                System.out.println("Ha ganado " + cartulina1);
                salir = true;
            } else if (cartulina2.cartulina.size() == 0){
                System.out.println("Ha ganado " + cartulina2);
                salir = true;
            }
        }
    }
}
