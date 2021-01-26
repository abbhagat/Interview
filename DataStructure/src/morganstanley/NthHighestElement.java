package morganstanley;

public class NthHighestElement {

    private static int[] a = {6, 5, 3, 1, 8, 7, 2, 4};
    private static int n, left, right, largest;
    private static int kth = 2;

    public static void buildheap() {
        n = a.length - 1;
        for (int i = n / 2; i >= 0; i--) {
            maxheap(i);
        }
    }

    public static void maxheap(int i) {
        left = 2 * i;
        right = 2 * i + 1;
        if (left <= n && a[left] > a[i]) {
            largest = left;
        } else {
            largest = i;
        }
        if (right <= n && a[right] > a[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(i, largest);
            maxheap(largest);
        }
    }

    public static void swap(int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void heapSort() {
        buildheap();
        int c = 0;
        for (int i = n; i >= 0; i--) {
            swap(0, i);
            n = n - 1;
            c++;
            if (c == kth) {
                System.out.println(a[i]);
            }
            maxheap(0);
        }
    }

    public static void main(String[] args) {
        heapSort();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
