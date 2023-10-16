import java.util.Random;
import java.util.Scanner;

public class SchleifenAufgaben {
  public static void main(String[] args){
    a13test();
  }
  static void a6(){
    for (int i = 1; i<=20; i++){
      if (i!=13) System.out.println(i);
    }
  }

  static void a9(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Geben Sie Ihren Kontostand an.");
    double kontostand = scan.nextDouble();
    System.out.println("Geben Sie den Preis des Produktes an.");
    double preis = scan.nextDouble();
    int anzahl = 0;
    while(kontostand>preis){
      anzahl++;
      kontostand/=preis;
    }
    System.out.println("Sie können "+  anzahl + "Produkte bei Ihrem Kontostand kaufen");
    System.out.println("Nach dem Kauf bleiben Ihnen " + kontostand + "€.");
  }

  static void a10(){
    int r = 0;
    while (r!=6){
      r = (int)(Math.random()*6)+1;
      System.out.println(r);
    }
  }
  static void a11(){
    int r = 0;
    do{
      r = (int)(Math.random()*100)+1;
      System.out.println(r);
    } while (r!=13);
  }
  static void a12(){
    for (int i = 1; i<11; i++){
      for (int j = 1; j<11; j++){
        System.out.print(i*j + " ");
        if(i*j<10){
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  static void a13(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Geben Sie die Höhe der Treppe an.");
    int h = scan.nextInt();
    System.out.println("Geben Sie die Breite der Treppe an.");
    int b = scan.nextInt();
    for (int i = 0; i<h; i++){ //Höhe
      for(int j = 0; j<h; j++){ //Anzahl der "Sternenschritte" (=Höhe)
        for (int k = 0; k<b; k++){ //Breite der einzelnen "Sternenschritte"
          if(j<h-i-1){
            System.out.print(" ");
          } else System.out.print("*");

        }
      }
      System.out.println();
    }
  }
  static void a13test(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Geben Sie die Höhe der Treppe an.");
    int h = scan.nextInt();
    System.out.println("Geben Sie die Breite der Treppe an.");
    int b = scan.nextInt();
    for (int i = 0; i<h; i++){ //Höhe
      for(int j = 0; j<h*b; j++){ //Anzahl*Breite der Sternenschritte (Alle einzelne Zeichen)
          if(j/b<h-i-1){
            System.out.print(" ");
          } else System.out.print("*");
      }
      System.out.println();
    }
  }
}
