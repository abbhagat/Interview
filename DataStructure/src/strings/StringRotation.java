package strings;

public class StringRotation {

    public static boolean isRotation(String s1, String s2) {

        if (s1.length() == s2.length()) {
            String s3 = s1 + s1;
            int pos = s3.indexOf(s2.charAt(0));
            if (pos == -1) {
                return false;
            }
            while (s1.charAt(pos + 1) == s2.charAt(0)) {
                pos++;
            }
            for (int i = pos, j = 0; i < (pos + s2.length()); i++, j++) {
                if (s3.charAt(i) != s2.charAt(j)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean areRotation(String s1, String s2) {
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("Password", "wordPass")   ? "Rotation" : "Not Rotation");
        System.out.println(areRotation("Password", "wordPasss") ? "Rotation" : "Not Rotation");
    }
}
