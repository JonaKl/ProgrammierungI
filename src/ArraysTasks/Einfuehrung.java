package ArraysTasks;

import java.util.Arrays;

public class Einfuehrung {
    public static void main(String[] args) {
        System.out.println(mittelwert(new int[]{1, 2, 3, 4, 5}));
        System.out.println(Arrays.toString(getBuchwerteAbschreibung(15000.0, 0.4, 100)));
    }
    //Aufgabe 1,3
    static double mittelwert(int[] arr){
        double  mittelwert = 0;
        for (int j : arr) {
            mittelwert += j;
        }
        return mittelwert / arr.length;
    }
    //Aufgabe 2
    static void indexOutOfBoundsException(int[] arr){
        System.out.println(arr[arr.length]);
    }
    //Aufgabe 4
    static double[] getBuchwerteAbschreibung(double b, double p, int r){
        int i;
        double b2 = b;
        for (i=0; b>=r; i++){
            b=b*(1-p);
        }
        double[] ret = new double[i];
        for (int j = 0; j < i; j++) {
            ret[j] = b2;
            b2 = b2*(1-p);
        }
        return ret;
    }
}
