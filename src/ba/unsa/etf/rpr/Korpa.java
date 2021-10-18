package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private static Artikl[] listaArtikala;

    static {
        listaArtikala = new Artikl[0];
    }

    private static void dodajElement(Artikl noviArtikl) {
        Artikl[] novaLista = new Artikl[listaArtikala.length + 1];
        for (Integer i = 0; i < listaArtikala.length; i++) {
            novaLista[i] = listaArtikala[i];
        }
        novaLista[listaArtikala.length] = noviArtikl;
        listaArtikala = novaLista;
    }

    public Korpa() {
        listaArtikala = new Artikl[0];
    }

    public static Artikl[] getArtikli() {
        return listaArtikala;
    }

    public static boolean dodajArtikl(Artikl noviArtikl) {
        if(listaArtikala.length == 50) {
            System.out.println("Korpa vec sadrzi maksimalan broj artikala (50)!");
            return false;
        } else {
            dodajElement(noviArtikl);
            return true;
        }
    }

    public static Artikl izbaciArtiklSaKodom(String kodArtikla) {
        if(listaArtikala.length == 0) {
            System.out.println("Korpa je prazana!");
        }
        Artikl[] novaLista = new Artikl[listaArtikala.length - 1];
        Integer j = 0;
        Artikl izbaceniArtikl = null;
        for(Integer i = 0; i < listaArtikala.length; i++) {
            if(listaArtikala[i].getKod().equals(kodArtikla)) {
                izbaceniArtikl = listaArtikala[i];
                i++;
            }
            else {
                novaLista[j] = listaArtikala[i];
                j++;
            }
        }
        listaArtikala = novaLista;
        return izbaceniArtikl;
    }

    public static final Integer dajUkupnuCijenuArtikala() {
        Integer suma = 0;
        for(Integer i = 0; i < listaArtikala.length; i++) {
            suma += listaArtikala[i].getCijena();
        }
        return suma;
    }
}
