package easy;

public class _28_Implement_strStr {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
        System.out.println(strStr("", ""));
    }
}
