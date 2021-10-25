package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

public class SupermarketTest {

    @org.junit.jupiter.api.Test
    void dodajArtiklTest() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl1 = new Artikl("Biciklo", 10, "1");
        Artikl artikl2 = new Artikl("Biciklo", 10, "2");
        Artikl artikl3 = new Artikl("Biciklo", 10, "3");
        supermarket.dodajArtikl(artikl1);
        supermarket.dodajArtikl(artikl2);
        supermarket.dodajArtikl(artikl3);
        assertEquals(3, supermarket.getArtikli().length);
    }

    @org.junit.jupiter.api.Test
    void izbaciArtiklTest() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl1 = new Artikl("Biciklo", 10, "1");
        Artikl artikl2 = new Artikl("Biciklo", 10, "2");
        Artikl artikl3 = new Artikl("Biciklo", 10, "3");
        supermarket.dodajArtikl(artikl1);
        supermarket.dodajArtikl(artikl2);
        supermarket.dodajArtikl(artikl3);
        supermarket.izbaciArtiklSaKodom("1");
        assertEquals(2, supermarket.getArtikli().length);
    }
}
