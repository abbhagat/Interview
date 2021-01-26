package morganstanley;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(Double.MIN_VALUE);
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        char[] chars = new char[] { '\u0097' };
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
