package Interfaces.Sparbuch;

public class SparbuchTest {
    public static void main(String[] args) {
        Sparbuch[] sparbuch = new Sparbuch[3];
        sparbuch[0] = new Sparbuch(135.01, "12345", 0.05);
        sparbuch[1] = new Sparbuch(1215.15, "3215", 0.001);
        sparbuch[2] = new Sparbuch(654654.55, "1557", 0.1);
        for (Sparbuch s : sparbuch) {
            Utilities.zeige(s);
        }

    }
}
