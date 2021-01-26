package arrays;

/*
 *
 * int a[] = { 20, -2, -3, 4, -1, -2, 1, 5, 8, -3 };
 * max_sum array = { 20, -2, -3, 4, -1, -2, 1, 5, 8 }
 */

import java.util.stream.IntStream;

public class LargestContigiousSumArrayPrint {

    //private static int a[] = { 20, -2, -3, 4, -1, -2, 1, 5, 8, -3 };
    private static int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};

    public static void main(String[] args) {
        int cur_sum, max_sum, start, end, s;
        cur_sum = max_sum = start = end = s = 0;
        for (int i = 0; i < a.length; i++) {
            cur_sum = Math.max(a[i], cur_sum + a[i]);
            max_sum = Math.max(cur_sum, max_sum);
            if (cur_sum < max_sum) {
                start = s;
                end   = i;
            }
            if (max_sum < 0) {
                s = i + 1;
            }
        }
        System.out.println(max_sum);
        IntStream.range(start, end).forEach(i -> System.out.print(a[i] + " "));
    }
}
