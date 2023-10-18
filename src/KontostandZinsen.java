

public class KontostandZinsen {
  public static void main(String[] args){
    double kontostand1 = 0.35;
    double kontostand2 = -12.1;
    double kontostand3 = 0;
    double kontostand4 = 823.41;
    double kontostand5 = 10112.46;
    System.out.println("Kontostand 1: ");
    kontostand(kontostand1);
    System.out.println("Kontostand 2: ");
    kontostand(kontostand2);
    System.out.println("Kontostand 3: ");
    kontostand(kontostand3);
    System.out.println("Kontostand 4: ");
    kontostand(kontostand4);
    System.out.println("Kontostand 5: ");
    kontostand(kontostand5);
  }

  static void kontostand(double k){
    if(k>0){
      System.out.println("Kontostand positiv");
      System.out.println("Zu Beginn betraegt dein Kontostand: " + k + " Euro.");
      k *= 1.005;
      System.out.println("Nach einem Jahr mit 0,5% src.Methoden.Zinsen betraegt dein Kontostand: " + round(k) + " Euro.");
    } else if (k==0){
      System.out.println("Dein Konto ist leer");
    } else System.out.println("Du bist insolvent");
  }
  static double round(double i){
    i*=100;
    int j = (int) i;
    i= (j+0.00)/100;
    return i;
  }
}
