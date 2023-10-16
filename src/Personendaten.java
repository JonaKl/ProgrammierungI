import java.util.Scanner;

public class Personendaten {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Geben Sie das Alter der Person an");
    int alter = scan.nextInt();
    boolean fahrerlaubnis = true;
    boolean volljaehrig;
    volljaehrig = (alter >= 18); //Wenn Alter >= 18, dann volljaehrig = true, sonst false
    System.out.println("Die Volljährigkeit einer " + alter + " jährigen Person ist " + volljaehrig);
  }
}
