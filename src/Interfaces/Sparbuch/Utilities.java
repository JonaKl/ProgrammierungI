package Interfaces.Sparbuch;

public class Utilities{
    static int n = 0;
    public static void zeige(Anzeigbar a) {
        StringBuilder sb = new StringBuilder();
        sb.append("Aufrufe: ");
        sb.append(++n);
        String s = new String();
        s = sb.toString();
        for(char c :s.toCharArray()){
            System.out.print(new String(c+""));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        a.zeige();
    }
}