package src.Methoden;

public class Faculty {
    public static void main(String[] args) {
        System.out.println(faculty(7));
    }
    public static int faculty(int n) {
        if (n > 1) {
            return n * faculty(n - 1);
        }
        return 1;
    }
}
