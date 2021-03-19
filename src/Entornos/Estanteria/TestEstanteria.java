package Entornos.Estanteria;

public class TestEstanteria {
    public static void main(String[] args) {
        try {
            Estanteria e = new Estanteria();
            Llibre l1 = new Llibre("Libro 1", "Juanma", 10);
            Llibre l2 = new Llibre("Libro 2", "Gustavo", 3);
            e.afegirLlibre(l1);
            e.afegirLlibre(l2);
            Llibre l3 = new Llibre("Libro 3", "Lluc", 6);
            Llibre l4 = new Llibre("Libro 4", "Miguel", 7);
            Llibre l5 = new Llibre("Libro 5", "Adán", 5);
            e.afegirLlibre(l3);
            e.afegirLlibre(l4);
            e.afegirLlibre(l5);
            e.topDiez();
            e.eliminarLlibre("Libro 3");
            e.veureEstanteria();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
