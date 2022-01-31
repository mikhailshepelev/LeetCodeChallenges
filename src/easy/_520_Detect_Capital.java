package easy;

public class _520_Detect_Capital {

    public static boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;

        int firstChar = word.charAt(0);
        int secondChar = word.charAt(1);
        if (firstChar >= 97 && firstChar <= 122 && secondChar >= 65 && secondChar <= 90) return false;
        for (int i = 2; i < word.length(); i++) {
            if (firstChar >= 65 && firstChar <= 90 && secondChar >= 65 && secondChar <= 90) {
                if (word.charAt(i) < 65 || word.charAt(i) > 90) return false;
            }
            if (firstChar >= 65 && firstChar <= 90 && secondChar >= 97 && secondChar <= 122) {
                if (word.charAt(i) < 97 || word.charAt(i) > 122) return false;
            }
            if (firstChar >= 97 && firstChar <= 122) {
                if (word.charAt(i) < 97 || word.charAt(i) > 122) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("leetcode"));
    }
}
