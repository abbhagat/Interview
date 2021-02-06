package morganstanley;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateAllStringCombination {

    private static List<String> input = Arrays.asList("ABC", "DEF", "GHI");

    public static List<String> find(int index) {
        List<String> result = new ArrayList<>();
        if (index == input.size()) {
            return result;
        }
        char[] charStr = input.get(index).toCharArray();
        if (index == input.size() - 1) {
            for (int i = 0; i < charStr.length; i++) {
                result.add("" + charStr[i]);
            }
            return result;
        }
        for (int i = 0; i < charStr.length; i++) {
            List<String> rest = find(index + 1);
            for (String s : rest) {
                result.add(charStr[i] + s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(find(0));
    }
}
