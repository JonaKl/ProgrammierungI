package Methoden;

import java.util.Scanner;

public class Faculty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gebe die Zahl ein, deren Fakultät du berechnen möchtest.");
        System.out.println(getFaculty(scan.nextInt()));
    }
    public static int getFaculty(int factorial) {
        if (factorial > 1) {
            return factorial * getFaculty(factorial - 1);
        }
        return 1;
    }
}
