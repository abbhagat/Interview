package morganstanley;

public class MaxDiffBetweenTwoElementsinAnArray {

    public static void main(String[] args) {
        int[] a = {-10, 4, -9, -5};
        int max_diff = Math.abs(a[0] - a[1]);
        for (int i = 1; i < a.length - 1; i++) {
            int diff = Math.abs(a[i] - a[i + 1]);
            max_diff = max_diff < diff ? diff : max_diff;
        }
        System.out.println(max_diff);
    }
}
