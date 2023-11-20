package Vererbung.Lebewesen;

public class Main {
    public static void main(String[] args) {
        Mensch m = new Mensch(19, "Jooschua Tonn", true);
        m.fleischEssen();
        m.vorstellen();
        Elefant e = new Elefant(20, "Dumbo", "Afrika");
        e.troeten();
        System.out.println(e);
        System.out.println(m);
    }
}
