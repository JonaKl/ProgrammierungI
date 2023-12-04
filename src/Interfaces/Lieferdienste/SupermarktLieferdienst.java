package Interfaces.Lieferdienste;

public class SupermarktLieferdienst implements Lieferdienst{
    @Override
    public void liefereWare() {
        System.out.println("Ware wird geliefert");
    }

    @Override
    public void bereiteZu() {
        System.out.println("Ware wird zubereitet");
    }

    @Override
    public void verpackeWare() {
        System.out.println("Ware wird verpackt");
    }

    @Override
    public void nehmeBestellungAuf() {
        System.out.println("Warenbestellung wird aufgenommen");
    }

    @Override
    public void schreibeRechnung() {
        System.out.println("Rechnung für Einkauf wird geschrieben");
    }
}
