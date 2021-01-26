package arrays;

public class Min_2nd_Min {

    public static void main(String[] args) {

        int[] a = {3, 5, -6, 1, 2, 9, -10, -10};
        int max, min, _2ndMin;
        max = min = _2ndMin = a[0];
        for (int x : a) {
            if (max < x) {
                max = x;
            }
            if (min > x) {
                min = x;
            }
        }
        for (int x : a) {
            if (x > min && x <= max) {
                _2ndMin = max = x;
            }
        }
        System.out.println("First Smallest  : " + min);
        System.out.println("Second Smallest : " + _2ndMin);
    }
}
