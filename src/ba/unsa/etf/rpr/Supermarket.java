package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private Artikl[] listaArtikala = new Artikl[0];

    private void dodajElement(Artikl noviArtikl, Integer n) {
        Artikl[] novaLista = new Artikl[n];
        for (Integer i = 0; i < n - 1; i++) {
            novaLista[i] = listaArtikala[i];
        }
        novaLista[n - 1] = noviArtikl;
        listaArtikala = novaLista;
    }

    public final Artikl[] getArtikli() {
        return listaArtikala;
    }

    public void dodajArtikl(Artikl noviArtikl) {
        if(listaArtikala.length == 1000) {
            System.out.println("Supermarket vec sadrzi maksimalan broj artikala (1000)!");
        } else {
            dodajElement(noviArtikl, listaArtikala.length + 1);
        }
    }

    public Artikl izbaciArtiklSaKodom(String kodArtikla) {
        if(listaArtikala.length == 0) {
            System.out.println("Supermarket je prazan!");
            return null;
        }
        Artikl[] novaLista = new Artikl[listaArtikala.length - 1];
        Integer j = 0;
        Artikl izbaceniArtikl = null;
        for(Integer i = 0; i < listaArtikala.length; i++) {
            if(listaArtikala[i].getKod().equals(kodArtikla)) {
                izbaceniArtikl = listaArtikala[i];
            }
            else {
                novaLista[j] = listaArtikala[i];
                j++;
            }
        }
        listaArtikala = novaLista;
        return izbaceniArtikl;
    }
}
