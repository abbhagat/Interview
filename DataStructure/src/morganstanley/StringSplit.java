package morganstanley;

import java.util.HashSet;

/*
 * Given three strings str1, str2 and str3; complete the function to find the
 * smallest subsequence in str1 which contains all the characters in str2 (in any order) and not those in str3.
Sample Input:
str1: spqrstrupvqw
str2: sprt
str3: q
Sample Output: strup
Explanation: In the given string str1, the smallest subsequence that contains the characters
in str2 ( 's' , 'p' , 'r' , 't' ) and does not contain the character in str3 ( 'q' ) is 'strup'.
 *
 */

public class StringSplit {

    private static boolean stringHasAllLetters(String stringToFind, String letters) {
        for (char c : letters.toCharArray()) {
            if (stringToFind.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "spqrstrupvsqw"; //"spqrstrupvqw";
        String s2 = "sprt";
        String s3 = "q";
        HashSet<String> results = new HashSet<>();
        String[] stringsToFind = s1.split(s3);
        for (String stringToFind : stringsToFind) {

            // ignore shorter strings
            if (stringToFind.length() < s2.length()) {
                continue;
            }

            // ignore the words that dont have every characters present in s2
            if (!stringHasAllLetters(stringToFind, s2)) {
                continue;
            }
            boolean subStringFound = false;
            int offset = 0;
            int i = 0;
            // start with the exact length
            while (!subStringFound) {
                // start to find all characters of s2 within equal length of words in stringToFind,
                // if not found, increase length each time
                for (i = 0; i <= (stringToFind.length() - s2.length() - offset); i++) {
                    String currentSegment = stringToFind.substring(i, i + s2.length() + offset);

                    if (stringHasAllLetters(currentSegment, s2)) {
                        results.add(currentSegment);
                        subStringFound = true;
                        break;
                    }
                }

                if (!subStringFound) {
                    i = 0;
                    offset++;
                }
            }

            System.out.println(results);
        }
    }
}
