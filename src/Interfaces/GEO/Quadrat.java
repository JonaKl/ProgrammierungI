package Interfaces.GEO;

public class Quadrat implements Geo {
    double seitenlaenge;

    public Quadrat(double seitenlaenge) {
        super();
        this.seitenlaenge = seitenlaenge;
    }

    @Override
    public double getFlaeche() {
        return seitenlaenge*seitenlaenge;
    }

}