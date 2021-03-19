package Entornos.Bingo;

public class BingoTest {
    public static void main(String[] args) {
        try {
            Bingo bingo = new Bingo();
            Cartulina cartulina1 = new Cartulina();
            Cartulina cartulina2 = new Cartulina();
            bingo.jugarBingo(cartulina1, cartulina2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
