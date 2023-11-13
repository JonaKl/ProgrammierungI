package OO.Beleg;

public class Main {
    public static void main(String[] args) {
        Beleg beleg1 = new Beleg(100, "01.01.2020");
        Beleg beleg2 = new Beleg(200, "02.06.2018");
        Beleg beleg3 = new Beleg(300, "03.12.2022");

        System.out.println(beleg1);
        System.out.println(beleg2);
        System.out.println(beleg3);
    }
}
