package easy;

public class _392_Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int firstStrPointer = 0;
        int secondStrPointer = 0;

        while (firstStrPointer < s.length()) {
            char sChar = s.charAt(firstStrPointer);

            if (secondStrPointer > t.length() - 1) return false;

            for (int i = secondStrPointer; i < t.length(); i++) {
                if (t.charAt(i) == sChar) {
                    firstStrPointer++;
                    secondStrPointer = i + 1;
                    break;
                }
                if (i == t.length() - 1) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));

        System.out.println(isSubsequence("acb", "ahbgdc"));
        System.out.println(isSubsequence("abc", ""));
        System.out.println(isSubsequence("bcd", "uuuuuubcd"));
    }
}
