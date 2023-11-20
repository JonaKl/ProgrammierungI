package Vererbung.Lebewesen;

public class Main {
    public static void main(String[] args) {
        Mensch m = new Mensch(19, "Jooschua Tonn", true);
        m.fleischEssen();
        m.vorstellen();
        Elefant e = new Elefant(20, "Dumbo", "Afrika");
        e.troeten();
        e.fliegen();
        System.out.println(e);
        System.out.println(m);
        Fogel f = new Fogel(1, "Piepmatz");
        f.fliegen();
        System.out.println(f);
    }
}
