package easy;

public class _14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];

        StringBuilder sb = new StringBuilder("");

        String strToCompareWith = strs[0];

        int currentCharIndex = 0;
        while (currentCharIndex < strToCompareWith.length()) {
            char ch = strToCompareWith.charAt(currentCharIndex);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= currentCharIndex) {
                    return sb.toString();
                }
                if (strs[i].charAt(currentCharIndex) != strToCompareWith.charAt(currentCharIndex)) {
                    return sb.toString();
                }
                if (i == strs.length - 1) {
                    sb.append(ch);
                }
            }
            currentCharIndex++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[] {"a"}));
        System.out.println(longestCommonPrefix(new String[] {"ab", "a"}));
    }
}
