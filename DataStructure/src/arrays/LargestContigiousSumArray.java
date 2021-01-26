package arrays;

/*
 * int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
 * max_sum = {4, -1, -2, 1, 5} = 7
 * Kandanes Algorithm
 */

public class LargestContigiousSumArray {

    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int cur_max = 0, max_sum = 0;
        for (int x : a) {
            cur_max = Math.max(x, cur_max + x);
            max_sum = Math.max(max_sum, cur_max);
        }
        System.out.println(max_sum);
    }
}
