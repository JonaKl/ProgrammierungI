package OO.Artikel;

public class Main {
    public static void main(String[] args) {
        Auftrag[] auftraege = new Auftrag[3];
        auftraege[0] = new Auftrag(1, 1, 1.99, 2);
        auftraege[1] = new Auftrag(2, new Artikel(2,355.2), 3);
        Artikel artikel3 = new Artikel(3, 4.99);
        auftraege[2] = new Auftrag(3, artikel3, 1);
        artikel3.setPreis(5.99);
        auftraege[2].setAnzahl(2);
        System.out.println(Auftrag.getGesamtwert(auftraege));
    }
}
