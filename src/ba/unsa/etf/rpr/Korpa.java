package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private Artikl[] listaArtikala;

    private void dodajElement(Artikl noviArtikl) {
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

    public Artikl[] getArtikli() {
        return listaArtikala;
    }

    public boolean dodajArtikl(Artikl noviArtikl) {
        if(listaArtikala.length == 50) {
            System.out.println("Korpa vec sadrzi maksimalan broj artikala (50)!");
            return false;
        } else {
            dodajElement(noviArtikl);
            return true;
        }
    }

    public Artikl izbaciArtiklSaKodom(String kodArtikla) {
        if(listaArtikala.length == 0) {
            System.out.println("Korpa je prazana!");
        }
        Artikl[] novaLista = new Artikl[listaArtikala.length - 1];
        Integer j = 0;
        Artikl izbaceniArtikl = null;
        for(Integer i = 0; i < listaArtikala.length; i++) {
            if(listaArtikala[i].getKod().equals(kodArtikla)) izbaceniArtikl = listaArtikala[i];
            else {
                novaLista[j] = listaArtikala[i];
                j++;
            }
        }
        listaArtikala = novaLista;
        return izbaceniArtikl;
    }

    public final Integer dajUkupnuCijenuArtikala() {
        Integer suma = 0;
        for(Integer i = 0; i < listaArtikala.length; i++) {
            suma += listaArtikala[i].getCijena();
        }
        return suma;
    }
}
