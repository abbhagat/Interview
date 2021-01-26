package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = { 20, 3, 15, 6, 9, 8, 2, 1 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
