package OO.Verzinsung;

public class Main {
    public static void main(String[] args) {
        System.out.println(Zinsen.getZinsen(1000, 0.05, 10));
        System.out.println(Zinsen.getZinsenRekursiv(1000, 0.05, 10));
    }


}
