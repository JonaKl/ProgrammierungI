package Methoden;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zinsen {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    for(int i=0; i<4; i++){
      System.out.println("Geben Sie den Namen des Kontoinhabers an.");
      String name = scan.nextLine();
      int kontostand = (int)(Math.random()*1000000);
      System.out.println("Zu Beginn beträgt der Kontostand von " + name + " " + kontostand + " Euro.");
      System.out.println("Nach einem Jahr beträgt der Kontostand von " + name + " " + kontoNachZinsen(kontostand, 1.005) + " Euro.");
    }
  }
  public static String kontoNachZinsen(int kontostand, double zinssatz){
    DecimalFormat df = new DecimalFormat("0.00"); //auf zwei Nachkommastellen runden
    return df.format(kontostand*zinssatz);
  }
}
