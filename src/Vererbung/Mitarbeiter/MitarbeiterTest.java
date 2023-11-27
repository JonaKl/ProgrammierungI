package Vererbung.Mitarbeiter;

public class MitarbeiterTest {
    public static void main(String[] args) {
        Angestellter angestellter = new Angestellter("Tonn", "Joschua", 10);
        Azubi azubi = new Azubi("Achenbach", "Paul", 5);
        angestellter.zeigeDaten();
        angestellter.addZulage(2);
        angestellter.befoerdere();
        angestellter.addZulage(50);
        angestellter.zeigeDaten();
        azubi.zeigeDaten();
        azubi.schreibePruefungen();
        azubi.erhoeheGehalt(1);
        azubi.setAbgelegtePruefungen(5);
        azubi.erhoeheGehalt(3);
        azubi.zeigeDaten();
    }
}
