// https://www.baeldung.com/java-quicksort

public class Quicksort {
    static int swaps = 0;
    public static void main(String[] args) {
        int[] toSort = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };
        // int[] toSort = { 9, -3, 5, 2, 6, 8, -6, 62, 60 };
        quickSort(toSort, 0, toSort.length - 1);
        System.out.println("swaps: " + swaps);
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
