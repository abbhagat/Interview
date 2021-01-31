package morganstanley;

import java.util.*;

public class Test {
    public static void main(String[] args) {
    Map<String,Integer> map = new HashMap<>();
    String a = "abc";
    String b = new String("abc");
    map.put(a,10);
    map.put(b,20);
    map.put(new String("abc"),30);
        System.out.println(map.get("abc"));
    }
}
