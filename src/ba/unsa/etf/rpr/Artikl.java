package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private Integer cijena;
    private String kod;

    public Artikl(String nazivArtikla, Integer cijenaArtikla, String kodArtikla) {
        this.naziv = nazivArtikla;
        this.cijena = cijenaArtikla;
        this.kod = kodArtikla;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public Integer getCijena() {
        return this.cijena;
    }

    public String getKod() {
        return this.kod;
    }
}
