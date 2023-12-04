package Interfaces.GEO;

public class GeoTest {
    public static void main(String[] args) {
        Geo[] geos = new Geo[3];
        geos[0] = new Rechteck(1, 4);
        geos[1] = new Quadrat(2);
        geos[2] = new Kreis(2);
        for (Geo geo : geos) {
            System.out.println(geo.getFlaeche());
        }
        System.out.println(GeoVergleich.vergleiche(geos[0], geos[1]));
        System.out.println(GeoVergleich.vergleiche(geos[2], geos[0]));
        System.out.println(GeoVergleich.vergleiche(geos[1], geos[2]));

    }
}
