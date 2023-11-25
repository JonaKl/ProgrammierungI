package Vererbung.FigurAbstakt;

public class Rechteck extends Figur{
    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public void zeichne(){
        for(int i = 0; i < breite; i++) {
            System.out.print("-");

        }
        System.out.println();
        for(int i=1; i<laenge-1; i++) {
            System.out.print("|");
            for(int j=1; j<breite-1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        for(int i = 0; i < breite; i++) {
            System.out.print("-");
        }
    }

    @Override
    public double getFlaeche() {
        return laenge * breite;
    }

    public double getLaenge() {
        return laenge;
    }

    public double getBreite() {
        return breite;
    }

    public double getUmfang() {
        return 2 * laenge + 2 * breite;
    }

    @Override
    public String toString() {
        return "Rechteck mit Länge " + laenge + " und Breite " + breite;
    }
}
