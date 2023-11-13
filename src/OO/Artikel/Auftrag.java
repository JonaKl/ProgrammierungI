package OO.Artikel;

public class Auftrag {
    private int id;
    private Artikel artikel;
    private int anzahl;

    public Auftrag(int id, Artikel artikel, int anzahl) {
        this.id = id;
        this.artikel = artikel;
        this.anzahl = anzahl;
    }

    public Auftrag(int id, int artikelID, double artikelPreis, int anzahl) {
        this.id = id;
        this.artikel = new Artikel(artikelID, artikelPreis);
        this.anzahl = anzahl;
    }

    public static double getGesamtwert(Auftrag[] auftraege){
        double gesamtwert = 0;
        for(Auftrag auftrag : auftraege){
            gesamtwert += auftrag.getArtikel().getPreis() * auftrag.getAnzahl();
        }
        return gesamtwert;
    }

    public int getId() {
        return id;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        if(anzahl>=0){
            this.anzahl = anzahl;
        }else throw new ArithmeticException("Die Anzahl muss größer oder gleich 0 sein.");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    @Override
    public String toString(){
        return "ID: " + this.id + ", Artikel: " + this.artikel + ", Anzahl: " + this.anzahl;
    }
}
