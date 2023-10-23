package Arrays;

public class Varargs {
    public static void main(String[] args) {
        System.out.println(mittelwert(1, 2, 3, 4, 5));
    }
    static double mittelwert(double... arr){
        double  mittelwert = 0;
        for (double j : arr) {
            mittelwert += j;
        }
        return mittelwert / arr.length;
    }
}
