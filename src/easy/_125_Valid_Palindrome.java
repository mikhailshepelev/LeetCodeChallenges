package easy;

public class _125_Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        int startRunner = 0;
        int endRunner = s.length() - 1;

        while (endRunner > startRunner) {
            char start = s.charAt(startRunner);
            char end = s.charAt(endRunner);
            if (!Character.isLetterOrDigit(start)) {
                startRunner++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)) {
                endRunner--;
                continue;
            }
            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            startRunner++;
            endRunner--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
    }
}
