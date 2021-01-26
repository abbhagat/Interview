package sorting;

import java.util.stream.IntStream;

public class QuickSort {

    private static int[] a = { 20, 3, 15, 6, 9, 8, 2, 1, 6, 8, 7, 15 };

    public static void main(String[] args) {
        quickSort(0, a.length - 1);
        IntStream.range(0, a.length).forEach(i -> System.out.print(a[i] + " "));
    }

    private static void quickSort(int low, int high) {
        int i = low;
        int j = high;
        int pivot = a[(low + high) / 2];
        while (i <= j) {
            while (a[i] < pivot) { // if the condition id while (a[i] > pivot) will sort in descending order
                i++;
            }
            while (a[j] > pivot) { // if the condition id while (a[j] < pivot) will sort in descending order
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(low, j);
        if (high > i)
            quickSort(i, high);
    }
}
