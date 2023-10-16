public class Rekursiv {
  public static void main(String[] args){
    person("Joschua Tonn", 19, "Horrem");
    person("Jona Kläß", "Kall");
    person("Jan Fratze");
    person("Ben Fisch", 21);
    System.out.println(fakultaet(7));
  }

  public static void person(String name, int alter, String wohnort){
    System.out.println(name + " ist " + alter + " Jahre alt und wohnt in " + wohnort + ".");
  }
  public static void person(String name, String wohnort){
    System.out.println(name + " wohnt in " + wohnort + ".");
  }
  public static void person(String name, int alter){
    System.out.println(name + " ist " + alter + " Jahre alt und wohnt in Köln.");
  }
  public static void person(String name){
    System.out.println(name + " wohnt in Köln.");
  }

  public static int fakultaet(int n){
    if (n > 1) {
      return n * fakultaet(n - 1);
    }
    return 1;
  }
}
