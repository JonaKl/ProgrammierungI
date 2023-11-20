package Vererbung.Lebewesen;

public class Lebewesen {
    private int anzahlBeine;
    private int alter;
    private String name;

    public Lebewesen(int anzahlBeine, int alter, String name){
        this.anzahlBeine = anzahlBeine;
        this.alter = alter;
        this.name = name;
    }

    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public void setAnzahlBeine(int anzahlBeine) {
        this.anzahlBeine = anzahlBeine;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hallo, ich bin " + name + ", " + alter + " Jahre alt" + " und habe " + anzahlBeine + " Beine.";
    }
}
