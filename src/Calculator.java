import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    calc();
  }
  public static void calc(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Geben Sie die erste Zahl an");
    double num1 = 0;
    double num2 = 0;
    try {
      num1 = scan.nextDouble();
    } catch(Exception e){
      System.out.println("Bitte geben Sie eine gültige Zahl an");
      calc();
    }
    boolean valid = false;
    String op = "";
    while(!valid){
      System.out.println("Geben Sie die Rechenoperation (+, -, *, /, ^2, sqrt) an");
      op = scan.next();
      if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("^2") || op.equals("sqrt")){
        valid = true;
      }else System.out.println("Ungültige Rechenoperation");
    }
    if(!op.equals("^2") && !op.equals("sqrt")) {
      System.out.println("Geben Sie die zweite Zahl an");
      try {
        num2 = scan.nextDouble();
      } catch (Exception e) {
        System.out.println("Bitte geben Sie eine gültige Zahl an");
        calc();
      }
    }
    double sol = 0;
    switch (op) {
      case "+" -> sol = num1 + num2;
      case "-" -> sol = num1 - num2;
      case "*" -> sol = num1 * num2;
      case "/" -> { try{
        sol = num1 / num2;
      }
      catch (Exception e) {
        System.out.println("Sie dürfen nicht durch 0 teilen");
        calc();
      }
      }
      case "^2" -> sol = num1*num1;
      case "sqrt" -> sol = Math.sqrt(num1);
      default -> System.out.println("Error");
    }
    if (op.equals("^2") || op.equals("sqrt")){
      System.out.println("Die Lösung ist " + sol);
    }else {
      System.out.println(num1 + op + num2 + " ergibt " + sol);
    }
  }
}
