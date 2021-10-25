package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

public class ArtiklTest {

    @org.junit.jupiter.api.Test
    void nazivTest() {
        Artikl artikl = new Artikl("Biciklo", 12, "123");
        assertEquals("Biciklo", artikl.getNaziv());
    }

    @org.junit.jupiter.api.Test
    void cijenaTest() {
        Artikl artikl = new Artikl("Biciklo", 12, "123");
        assertEquals(12, artikl.getCijena());
    }

    @org.junit.jupiter.api.Test
    void kodTest() {
        Artikl artikl = new Artikl("Biciklo", 12, "123");
        assertEquals("123", artikl.getKod());
    }
}
