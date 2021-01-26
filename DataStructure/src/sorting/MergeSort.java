package sorting;

import java.util.stream.IntStream;

public class MergeSort {

    private static int[] a = {11, 15, 13, 14, 12, 16, 17, 19, 18, 20};
    private static int[] temp = new int[a.length];

    public static void main(String[] args) {
        partition(0, a.length - 1);
        IntStream.range(0, a.length).forEach(i -> System.out.print(a[i] + " "));
    }

    private static void partition(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            partition(low, mid);
            partition(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private static void merge(int low, int mid, int high) {
        int i, j, k;
        i = low;
        k = low;
        j = mid + 1;
        while (i <= mid && j <= high) {
            if (a[i] > a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        if (i > mid) {
            for (int l = i; l <= high; l++) {
                temp[k++] = a[l];
            }
        } else {
            for (int l = i; l <= mid; l++) {
                temp[k++] = a[l];
            }
        }
        for (int l = low; l <= high; l++) {
            a[l] = temp[l];
        }
    }
}
