package Interfaces.Lieferdienste;

public class PizzaLieferdienst implements Lieferdienst{

        @Override
        public void liefereWare() {
            System.out.println("Pizza wird geliefert");
        }

        @Override
        public void bereiteZu() {
            System.out.println("Pizza wird zubereitet");
        }

        @Override
        public void verpackeWare() {
            System.out.println("Pizza wird verpackt");
        }

        @Override
        public void nehmeBestellungAuf() {
            System.out.println("Pizza wird bestellt");
        }

        @Override
        public void schreibeRechnung() {
            System.out.println("Pizzarechnung wird geschrieben");
        }
}
