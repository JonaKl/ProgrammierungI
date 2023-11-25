package Vererbung.FigurAbstakt;

public class Kreis extends Figur{
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    @Override
    public void zeichne(){
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                if (Math.pow(i - radius, 2) + Math.pow(j - radius, 2) <= Math.pow(radius, 2)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public double getFlaeche() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public double getUmfang() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Kreis mit Radius " + radius;
    }
}
