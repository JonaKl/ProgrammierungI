package Vererbung.FigurAbstakt;

public class Main {
    public static void main(String[] args) {
        Figur[] figuren = new Figur[2];
        figuren[0] = new Kreis(5);
        figuren[1] = new Rechteck(5, 10);

        for (Figur figur : figuren) {
            System.out.println(figur);
            System.out.println("Fläche: " + figur.getFlaeche());
            figur.zeichne();
            System.out.println();
        }
    }
}
