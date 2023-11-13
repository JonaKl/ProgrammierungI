package OO.Beleg;

public class Beleg {
    private static int belegnummer = 10000;
    private double betrag;
    private String datum;
    private String bezeichnung;

    public Beleg(double betrag, String datum) {
        belegnummer++;
        this.bezeichnung = String.valueOf(belegnummer);
        this.betrag = betrag;
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Bezeichnung: " + this.bezeichnung + ", Betrag: " + this.betrag + ", Datum: " + this.datum;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getBetrag() {
        return betrag;
    }

    public String getDatum() {
        return datum;
    }
}
