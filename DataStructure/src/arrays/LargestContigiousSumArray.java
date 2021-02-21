package arrays;

import java.util.stream.IntStream;

public class LargestContiguousSumArray {

    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        int cur_sum, max_sum;
        cur_sum = max_sum = a[0];
        for (int i = 1; i < a.length; i++) {
            cur_sum = Math.max(a[i], cur_sum + a[i]);
            max_sum = Math.max(cur_sum, max_sum);
        }
        System.out.println(max_sum);
    }
}
