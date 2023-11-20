package Vererbung.Lebewesen;

public class Elefant extends Lebewesen{
    private String lebensraum;
    public Elefant(int alter, String name, String lebensraum){
        super(4, alter, name);
        this.lebensraum = lebensraum;
    }

    public void troeten(){
        System.out.println("Töterötöö");
    }

    public String getLebensraum() {
        return lebensraum;
    }

    public void setLebensraum(String lebensraum) {
        this.lebensraum = lebensraum;
    }

    @Override
    public String toString() {
        return super.toString() + " Ich bin ein Elefant und lebe in " + lebensraum + "." + " Töterötöö!";
    }
}
