package Vererbung.Mitarbeiter;

public class Azubi extends Mitarbeiter{
    private int abgelegtePruefungen = 0;

    public Azubi(String nachname, String vorname, double gehalt){
        super(nachname, vorname, gehalt);
    }
    public void setAbgelegtePruefungen(int abgelegtePruefungen){
        this.abgelegtePruefungen = abgelegtePruefungen;
    }

    public void schreibePruefungen(){
        abgelegtePruefungen++;
        System.out.println(vorname + " " + nachname + " hat eine Prüfung geschrieben. Insgesamt hat er nun " + abgelegtePruefungen + " Prüfungen abgelegt.");
    }

    @Override
    public void zeigeDaten() {
        super.zeigeDaten();
        System.out.println("Abgelegte Prüfungen: " + abgelegtePruefungen);
    }

    @Override
    public void addZulage(double betrag) {
        if(abgelegtePruefungen>3) {
            gehalt += betrag;
        }else System.out.println("Mit weniger als 4 abgelegten Prüfungen kann keine Zulage hinzugefügt werden.");
    }
}
