package Entornos.Nevera;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestNevera {
    @Test
    public void testNevera() {
        Nevera nevera = new Nevera();
        nevera.put("cocacola");
        //Los assertEquals pueden ser simplificados por assertTrue o assertFalse respectivamente.
        assertTrue(nevera.contains("cocacola"));
        nevera.put("fanta");
        assertTrue(nevera.contains("fanta"));
        assertFalse(nevera.contains("nestea"));

        try {
            nevera.take("7up");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}