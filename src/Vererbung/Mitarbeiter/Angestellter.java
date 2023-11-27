package Vererbung.Mitarbeiter;

public class Angestellter extends Mitarbeiter{
    private static final int MAX_STUFE = 5;
    private int stufe = 1;
    public Angestellter(String nachname, String vorname, double gehalt){
        super(nachname, vorname, gehalt);
    }
    public void befoerdere(){
        if (stufe < MAX_STUFE){
            stufe++;
            System.out.println(vorname + " " + nachname + " wurde befördert.");
        }else {
            System.out.println(vorname + " " + nachname + " ist bereits auf der höchsten Stufe.");
        }
    }

    @Override
    public void zeigeDaten(){
        super.zeigeDaten();
        System.out.println("Aktuelle Stufe: " + stufe);
    }

    @Override
    public void addZulage(double betrag) {
        if(stufe>1) {
            gehalt += betrag;
        }else System.out.println("Auf Stufe 1 kann keine Zulage hinzugefügt werden.");
    }
}
