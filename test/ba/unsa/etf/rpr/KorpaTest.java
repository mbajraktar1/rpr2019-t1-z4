package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

public class KorpaTest {

    @org.junit.jupiter.api.Test
    void dodajArtiklTest() {
        Korpa korpa = new Korpa();
        Artikl artikl1 = new Artikl("Biciklo", 10, "1");
        Artikl artikl2 = new Artikl("Biciklo", 10, "2");
        Artikl artikl3 = new Artikl("Biciklo", 10, "3");
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        korpa.dodajArtikl(artikl3);
        assertEquals(3, korpa.getArtikli().length);
    }

    @org.junit.jupiter.api.Test
    void izbaciArtiklTest() {
        Korpa korpa = new Korpa();
        Artikl artikl1 = new Artikl("Biciklo", 10, "1");
        Artikl artikl2 = new Artikl("Biciklo", 10, "2");
        Artikl artikl3 = new Artikl("Biciklo", 10, "3");
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        korpa.dodajArtikl(artikl3);
        korpa.izbaciArtiklSaKodom("1");
        assertEquals(2, korpa.getArtikli().length);
    }

    @org.junit.jupiter.api.Test
    void dajUkupnuCijenuArtikalaTest() {
        Korpa korpa = new Korpa();
        Artikl artikl1 = new Artikl("Biciklo", 10, "1");
        Artikl artikl2 = new Artikl("Biciklo", 10, "2");
        Artikl artikl3 = new Artikl("Biciklo", 10, "3");
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        korpa.dodajArtikl(artikl3);
        assertEquals(30, korpa.dajUkupnuCijenuArtikala());
    }
}
