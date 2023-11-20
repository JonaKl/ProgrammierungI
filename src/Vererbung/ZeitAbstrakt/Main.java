package Vererbung.ZeitAbstrakt;

public class Main {
    public static void main(String[] args) {
        Zeit[] zeiten = new Zeit[4];
        zeiten[0] = new Tage(1);
        zeiten[1] = new Stunden(1);
        zeiten[2] = new Minuten(1);
        zeiten[3] = new StundenMinuten(2, 10);

        for (Zeit zeit : zeiten) {
            System.out.println("Zeit in Minuten: " + zeit.getMinuten());
            System.out.println("Zeit in Sekunden: " + zeit.getSekunden());
        }
    }
}
