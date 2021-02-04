package sorting;

import java.util.stream.IntStream;

public class HeapSort {

    private static int[] a = {6, 5, 3, 1, 8, 7, 2, 4};
    private int n = a.length - 1;

    void buildheap() {
        for (int i = n / 2; i >= 0; i--) {
            maxheap(i);
        }
    }

    void maxheap(int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int largest;
        largest = (left <= n && a[left] > a[i]) ? left : i;
        largest = (right <= n && a[right] > a[largest]) ? right : largest;
        if (largest != i) {
            swap(i, largest);
            maxheap(largest);
        }
    }

    void swap(int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    void sort() {
        buildheap();
        for (int i = n; i >= 0; i--) {
            swap(0, i);
            n = n - 1;
            maxheap(0);
        }
    }

    public static void main(String[] args) {
        new HeapSort().sort();
        IntStream.range(0, a.length).forEach(i -> System.out.print(a[i] + " "));
    }
}
