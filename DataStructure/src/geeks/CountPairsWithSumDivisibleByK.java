package geeks;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Input : A[] = {2, 2, 1, 7, 5, 3}, k = 4
 * Output : 5
 * Explanation :
 * There are five pairs possible whose sum
 * is divisible by '4' i.e., (2, 2),
 * (1, 7), (7, 5), (1, 3) and (5, 3)
 * <p>
 * Input : A[] = {5, 9, 36, 74, 52, 31, 42}, k = 3
 * Output : 7
 */


public class CountPairsWithSumDivisibleByK {

    private static final int[] a = {2, 2, 1, 7, 5, 3};
    private static Map<String, Integer> map = new HashMap<>();
    private static List<Integer> al = new ArrayList<>();

    private static void countKdivPairs(int index, int curSum, int givenSum) {

        if (curSum == givenSum) {
            map.put(al.toString(), al.size());
        }

        if (curSum > givenSum) {
            return;
        }

        for (int i = index; i < a.length; i++) {
            curSum += a[i];
            al.add(a[i]);
            countKdivPairs(i + 1, curSum, givenSum);
            al.remove(al.size() - 1);
            curSum -= a[i];
        }

    }

    public static void main(String[] args) {
        countKdivPairs(0, 0, 0);
        System.out.println(map);
    }
}
