package geeks;

import java.util.Arrays;

public class CountPairsWithPerfectSquareSum {

    public static void main(String[] args) {
        int[] a = {3, 4, 5};
        Arrays.sort(a);
        int i = 0, j = a.length - 1, x = 0, y = 0, n = 8;
        int diff = Integer.MAX_VALUE;
        while (j > i) {
            int sum = Math.abs(a[i] + a[j] - n);
            if (sum < diff) {
                x = i;
                y = j;
                diff = sum;
            }
            int k = (a[i] + a[j] > n) ? j-- : i++;
        }
        System.out.println("The closest pair is " + a[x] + " and " + a[y]);
    }
}
