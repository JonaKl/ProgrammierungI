package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Fortgeschritten {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gebe die Länge des Pascal'schen Dreieck an");
        System.out.println(" "+Arrays.deepToString(getPascalschesDreieck(scan.nextInt())).replace("0", " ").replace(",", "").replace("[", "").replace("]", "\n"));
    }
    static int[][] getPascalschesDreieck(int n){
        int[][] pascalschesDreieck = new int[n][n*2-1];
        pascalschesDreieck[0][n-1] = 1;
        pascalschesDreieck[n-1][0] = 1;
        pascalschesDreieck[n-1][pascalschesDreieck[n-1].length-1] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n*2-2; j++) {
                pascalschesDreieck[i][j] = pascalschesDreieck[i-1][j-1] + pascalschesDreieck[i-1][j+1];
            }
        }

        return pascalschesDreieck;
    }
}
