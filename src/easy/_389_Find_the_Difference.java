package easy;

public class _389_Find_the_Difference {
    public static char findShuffledString(String s, String t) {
        int sAsciiCodesSum = 0;
        int lAsciiCodesSum = 0;

        for (int i = 0; i < s.length(); i++) {
            sAsciiCodesSum += s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            lAsciiCodesSum += t.charAt(i);
        }

        return (char) (lAsciiCodesSum - sAsciiCodesSum);
    }
}
