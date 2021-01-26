package arrays;

/*
Loop the arr[] and maintain two sums incl and excl

incl = Max sum including the previous element
excl = Max sum excluding the previous element

Max sum excluding the current element will be max(incl, excl) and
Max sum including the current element will be excl + current element

(Note that only excl is considered because elements cannot be adjacent).

At the end of the loop return max of incl and excl.
*/

//Maximum sum such that no two elements are adjacent
public class MaxSumNonAdjacentArray {

    private static int[] a = {5, 5, 10, 100, 10, 5};

    private static int findMaxSum() {
        int incl = a[0];
        int excl = 0;
        int excl_new;
        for (int i = 1; i < a.length; i++) {
            excl_new = incl > excl ? incl : excl;  /* current max excluding i */
            incl = excl + a[i];                     /* current max including i */
            excl = excl_new;
        }
        return incl > excl ? incl : excl;     /* return max of incl and excl */
    }

    public static void main(String[] args) {
        System.out.println(findMaxSum());
    }
}
