package sorting;

import java.util.stream.IntStream;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {20, 3, 15, 6, 9, 8, 2, 1};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        IntStream.range(0, a.length).forEach(i -> System.out.print(a[i] + " "));
    }
}
