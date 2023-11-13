package OO.Abschreibung;

public class Main {
    public static void main(String[] args) {
        Abschreibung abschreibung1 = new Abschreibung(10000, 10);
        System.out.println(abschreibung1.getLineareAbschreibung());
        System.out.println(abschreibung1.getDegressiveAbschreibung());
        Abschreibung abschreibung2 = new Abschreibung(10000, 10, 200);
        System.out.println(abschreibung2.getLineareAbschreibung());
        System.out.println(abschreibung2.getDegressiveAbschreibung());
    }
}
