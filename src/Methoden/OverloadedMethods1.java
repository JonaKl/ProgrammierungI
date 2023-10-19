package Methoden;

public class OverloadedMethods1 {
  public static void main(String[] args) {
    person("Joschua Tonn", 19, "Horrem");
    person("Jona Kläß", "Kall");
    person("Jan Fratze");
    person("Ben Fisch", 21);
  }

  public static void person(String name, int alter, String wohnort) {
    System.out.println(name + " ist " + alter + " Jahre alt und wohnt in " + wohnort + ".");
  }

  public static void person(String name, String wohnort) {
    System.out.println(name + " wohnt in " + wohnort + ".");
  }

  public static void person(String name, int alter) {
    person(name, alter, "Köln");
  }

  public static void person(String name) {
    person(name, "Köln");
  }

}
