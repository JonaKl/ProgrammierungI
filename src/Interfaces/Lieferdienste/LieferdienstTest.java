package Interfaces.Lieferdienste;

public class LieferdienstTest {
    public static void main(String[] args) {
        Lieferdienst[] lieferdienste = new Lieferdienst[2];
        lieferdienste[0] = new PizzaLieferdienst();
        lieferdienste[1] = new SupermarktLieferdienst();
        for (Lieferdienst lieferdienst : lieferdienste) {
            lieferdienst.nehmeBestellungAuf();
            lieferdienst.bereiteZu();
            lieferdienst.verpackeWare();
            lieferdienst.liefereWare();
            lieferdienst.schreibeRechnung();
        }
    }
}
