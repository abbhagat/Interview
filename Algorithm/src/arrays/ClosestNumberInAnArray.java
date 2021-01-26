package arrays;

import java.util.Arrays;

import static java.lang.Math.abs;

public class ClosestNumberInAnArray {

    public static void main(String[] args) {

        int[] a = {-1, 7, 9, 4, 2, 1};
        int k = 0;
        Arrays.sort(a);
        int near = a[0];
        for (int i = 1; i < a.length; i++) {
            if (abs(near - k) >= abs(a[i] - k)) {
                near = a[i];
            }
        }
        System.out.println(near);
    }
}


/*

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int k = Integer.parseInt(br.readLine().trim());
        int[] a = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        int[] a = {-1, 7, 9, 4, 2, 1};
        it k = 0;
        int[] a = {2, 5, 6, 7, 8, 8, 9};
        int k = 4;
        int[] a = {1, 2, 4, 5, 6, 6, 8, 9};
        int k = 11;
 */
