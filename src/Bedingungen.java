import java.util.Scanner;

public class Bedingungen {
  public static void main(String[] args){
    boolean k = false;
    if (k = true) {
      System.out.println("k hat den Wert true.");
    } //Da nur ein = verwendet wird, wird k in der if-Bedingung true gesetzt und dann gefragt ob k true ist. Somit wird der Block ausgeführt.
    wochentag();
    tageImMonat();
  }
  static void wochentag(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Gebe einen Wochentag in folgendem Format ein: Montag");
    String wochentag = scan.next();
    /*
    if (wochentag.equals("Montag")||wochentag.equals("Dienstag")||wochentag.equals("Mittwoch")||wochentag.equals("Donnerstag")||wochentag.equals("Freitag")){
      System.out.println("Der Wochentag " + wochentag + " ist ein Werktag.");
    }else if (wochentag.equals("Samstag")||wochentag.equals("Sonntag")){
      System.out.println("Der Wochentag " + wochentag + " ist ein Wochenendtag");
    } else {
      System.out.println("Falsche Eingabe.");
      wochentag();
    }
    */
    switch (wochentag){
      case "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag":
        System.out.println("Der Wochentag " + wochentag + " ist ein Werktag.");
        break;
      case "Samstag", "Sonntag":
        System.out.println("Der Wochentag " + wochentag + " ist ein Wochenendtag");
        break;
      default:
        System.out.println("Falsche Eingabe");
        wochentag();
    }
  }

  static void tageImMonat(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Gebe einen Monat ein, um zu erfahren, wie viele Tage dieser hat. Verwende folgendes Format: Januar");
    String monat = scan.next();
    /*
    if(monat.equals("Januar")||monat.equals("März")||monat.equals("Maerz")||monat.equals("Mai")||monat.equals("Juli")||monat.equals("August")||monat.equals("Oktober")||monat.equals("Dezember")){
      System.out.println("Der Monat " + monat + " hat 31 Tage.");
    }else if (monat.equals("April")||monat.equals("Juni")||monat.equals("September")||monat.equals("November")){
      System.out.println("Der Monat" + monat + " hat 30 Tage.");
    }else if (monat.equals("Februar")){
      System.out.println("Der Monat " + monat + " hat 28 Tage.");
    }else {
      System.out.println("Falsche Eingabe.");
      tageImMonat();
    }
    */
    switch (monat){
      case "Januar", "März", "Maerz", "Mai", "Juli", "August", "Oktober", "Dezember":
        System.out.println("Der Monat " + monat + " hat 31 Tage.");
        break;
      case "April", "Juni", "September", "November":
        System.out.println("Der Monat " + monat + " hat 30 Tage.");
        break;
      case "Februar":
        System.out.println("Der Monat " + monat + " hat 28 Tage.");
        break;
      default: System.out.println("Falsche Eingabe"); tageImMonat();
    }
  }
}

