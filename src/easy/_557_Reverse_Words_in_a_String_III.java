package easy;

public class _557_Reverse_Words_in_a_String_III {
    public static String reverseWords(String s) {
        int start = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                StringBuilder reversed = reverseWord(s, start, i-1);
                sb.append(reversed).append(" ");
                start = i + 1;
            }
        }
        sb.append(reverseWord(s, start, s.length() - 1));
        return sb.toString();
    }

    private static StringBuilder reverseWord(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        while (end >= start) {
            sb.append(s.charAt(end--));
        }
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("God Ding"));
    }
}
