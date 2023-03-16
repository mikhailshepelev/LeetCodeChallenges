package easy;

public class _696_Count_Binary_Substrings {
    public static int countBinarySubstrings(String s) {
        int[] groups = new int[s.length()];
        int t = 0;
        groups[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                groups[t]++;
            }
            else {
                groups[++t] = 1;
            }
        }

        int result = 0;
        for (int i = 1; i < groups.length; i++) {
            result += Math.min(groups[i - 1], groups[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
        System.out.println(countBinarySubstrings("10101"));
    }
}
