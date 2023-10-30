// https://www.baeldung.com/java-quicksort

import java.sql.Time;


public class Quicksort {
    static int swaps = 0;
    public static void main(String[] args) {
        Time time = new Time(System.currentTimeMillis());
        int[] toSort = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };
        quickSort(toSort, 0, toSort.length - 1);
        System.out.println("swaps: " + swaps);
        System.out.println("The algorithm needs " + (System.currentTimeMillis()-time.getTime()) + " ms to sort the array of the length " + toSort.length + ".");

        time = new Time(System.currentTimeMillis());
        toSort = new int[]{9, -3, 5, 2};
        quickSort(toSort, 0, toSort.length - 1);
        System.out.println("swaps: " + swaps);
        System.out.println("The algorithm needs " + (System.currentTimeMillis()-time.getTime()) + " ms to sort the array of the length " + toSort.length + ".");

        time = new Time(System.currentTimeMillis());
        toSort = new int[]{9, -3, 5, 2,3,5,6,600,12,45,45,7,-4,-45,-456,-45,45,2,8,2,1,9,4,5,6,776,456,4678,676,543,243,4,67,3,456,456,78,3,123,-6,45645,654,6};
        quickSort(toSort, 0, toSort.length - 1);
        System.out.println("swaps: " + swaps);
        System.out.println("The algorithm needs " + (System.currentTimeMillis()-time.getTime()) + " ms to sort the array of the length " + toSort.length + ".");
    }
    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        System.out.println("Now, pivot is arr[" + end + "] = " + pivot);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                swapTwoValuesInArray(arr, begin, j);
                begin++;
            }
        }
        // Pivot wird ans Ende des aktuellen Sub-Arrays gesetzt: logisch, da alle diese Elemente kleiner sind
        swapTwoValuesInArray(arr, begin, end);
        printArray(arr);
        System.out.println("present pivot is arr[" + (begin) + "] = " + arr[begin]);
        return begin;
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void swapTwoValuesInArray(int[] arr, int firstValue, int secondValue) {
    	int swapTemp = arr[firstValue];
        arr[firstValue] = arr[secondValue];
        arr[secondValue] = swapTemp;
        swaps++;
    }
}
