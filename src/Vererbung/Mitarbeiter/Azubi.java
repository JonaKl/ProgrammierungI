package Vererbung.Mitarbeiter;

public class Azubi extends Mitarbeiter{
    private int abgelegtePruefungen;
    public Azubi(String nachname, String vorname, double gehalt, int abgelegtePruefungen){
        super(nachname, vorname, gehalt);
        this.abgelegtePruefungen = abgelegtePruefungen;
    }

    @Override
    public void addZulage(double betrag) {
        gehalt += betrag;
    }
}
