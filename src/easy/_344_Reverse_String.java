package easy;

public class _344_Reverse_String {
    public static void reverseString(char[] s) {
        int startPointer = 0;
        int endPointer = s.length - 1;

        while (endPointer > startPointer) {
            char temp = s[startPointer];
            s[startPointer] = s[endPointer];
            s[endPointer] = temp;
            startPointer++;
            endPointer--;
        }
    }

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
        reverseString(new char[]{'H','a','n','n','a','h'});
    }
}
