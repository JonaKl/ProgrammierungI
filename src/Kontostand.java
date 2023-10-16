import java.text.DecimalFormat;

public class Kontostand {
  public static void main(String[] args){
    DecimalFormat df = new DecimalFormat("0.00");
    for (int i = 0;i<5;i++){
      int kontostand = (int)(Math.random()*100000);
      System.out.println("Zu Beginn beträgt der Kontostand " + kontostand + " Euro.");
      System.out.println("Nach einem Jahr mit 0,5% Zinsen beträgt der Kontostand " + df.format(kontostand*1.005) + " Euro.");
    }
  }
}
