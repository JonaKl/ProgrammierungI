import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[] arr, int l, int r){
        if (l < r){
            int i = l;
            int j = r;
            int pivot = arr[(l+r)/2];
            while (i <= j){
                while (arr[i] < pivot){
                    i++;
                }
                while (arr[j] > pivot){
                    j--;
                }
                if (i <= j){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
                }
            }
            quicksort(arr, l, j);
            quicksort(arr, i, r);
        }
    }
}
