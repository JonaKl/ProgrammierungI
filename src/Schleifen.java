import java.util.Scanner;

public class Schleifen {
  public static void main(String[] args){
    //zusatzaufgabe();
    //quadratzahlen();
    alphabet();
  }
  static void zusatzaufgabe(){ //Aufgabe 1 und Aufgabe 4a
    double b = 15000.0;
    double p = 0.4;
    int r = 100;
    int i;
    for (i=0; b>=r; i++){
      b=b*(1-p);
    }
    System.out.println("Bis zum Erreichen des Restwerts sind " + i + " Intervalle vergangen.");
  }

  static void alphabet(){ //Aufgabe 4b
    char buchstabe;
    for (int i = 0; i<26; i++){
      buchstabe = (char) (i+65);
      System.out.print(buchstabe);
    }
  }

  static void quadratzahlen(){ //Aufgabe 2/3
    Scanner scan = new Scanner(System.in);
    System.out.print("Gebe ein, wie viele Quadratzahlen angezeigt werden sollen: ");
    int n = scan.nextInt();
    for (int i=1; i<=n; i=i++){
      int x = i*i;
      System.out.println(i + "^2 = " + x);
    }
  }
}