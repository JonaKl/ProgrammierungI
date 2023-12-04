package Interfaces.Sparbuch;

public class Utilities{
    static int i = 0;
    public static void zeige(Anzeigbar a) {
        i++;
        System.out.println("Aufrufe: " + i);
        a.zeige();
    }
}
