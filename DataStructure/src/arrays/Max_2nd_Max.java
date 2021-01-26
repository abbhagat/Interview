package arrays;

public class Max_2nd_Max {

    public static void main(String[] args) {

        int[] a = {5, -3, 1}; // {3, 5, 6, 1, 2, 9, -10, -10}
        int max, min, _2ndMax;
        max = min = _2ndMax = a[0];
        for (int x : a) {
            if (max < x) {
                max = x;
            }
            if (min > x) {
                min = x;
            }
        }
        for (int x : a) {
            if (x < max && x >= min) {
                _2ndMax = min = x;
            }
        }
        System.out.println("First  Highest : " + max);
        System.out.println("Second Highest : " + _2ndMax);
    }
}
