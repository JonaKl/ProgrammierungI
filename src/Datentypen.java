public class Datentypen {
  static boolean x;
  public static void main(String[] args) {
    int a = 1234567890;
    char b = 'c';
    boolean c = true;
    double d = 123.9324;
    String e = "Hallihallohalloechen";
    long f = 1234567890123456789L;
    System.out.println(x);
    System.out.println("Int: " + a);
    System.out.println("Char: " + b);
    System.out.println("Boolean: " + c);
    System.out.println("Double: " + d);
    System.out.println("String: " + e);
    System.out.println("Long: " + f);
    a = 'a';
    System.out.println("Int/Char: " + a);
  }
}
