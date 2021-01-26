package strings;

public class AllPossibleCombinationOfString {

    static char[] c = {'A', 'B', 'C'};

    static void permute(int start, int end) {
        if (start == end) {
            System.out.println(c);
        }
        for (int i = start; i <= end; i++) {
            swap(i, start);
            permute(start + 1, end);
            swap(i, start);
        }
    }

    static void swap(int x, int y) {
        char t = c[x];
        c[x] = c[y];
        c[y] = t;
    }

    public static void main(String[] args) {
        permute(0, c.length - 1);
    }
}
