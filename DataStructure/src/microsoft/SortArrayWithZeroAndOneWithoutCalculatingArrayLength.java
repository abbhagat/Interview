package microsoft;

/*
 * This can be done in linear time, with no extra space.
 * We do a linear based insertion sort, but do it twice, once for 0, and once for 1
 */
public class SortArrayWithZeroAndOneWithoutCalculatingArrayLength {

    static int[] a = {0, 0, 1, 0, 1, 0, 0, 0, 1, 1};

    static int move(int start, int val) {
        int i = start;
        int j = start;
        while (true) {
            try {
                if (a[j] == val) {
                    a[i] = a[i] ^ a[j];
                    a[j] = a[i] ^ a[j];
                    a[i] = a[i] ^ a[j];
                    i++;
                }
                j++;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
        return i;
    }

    static void move() {
        int i = 0 , j = 0;
        while (true) {
            try {
                if (a[i] == 0) {
                    a[i] = a[i] ^ a[j];
                    a[j] = a[i] ^ a[j];
                    a[i] = a[i] ^ a[j];
                    j++;
                }
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        move();
//        move(0, 0);
        //int zeroEnd = move(0, 0);
        //int oneEnd = move(move(a, 0, 0), 1);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
