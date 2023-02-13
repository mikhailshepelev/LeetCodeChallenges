package easy;

public class _345_Reverse_Vowels_of_a_String {
    public static String reverseVowels(String s) {
        int startRunner = 0;
        int endRunner = s.length() - 1;
        char[] chars = s.toCharArray();

        while (startRunner < endRunner) {
            if (isNotVowel(s, startRunner)) {
                startRunner++;
                continue;
            }
            if (isNotVowel(s, endRunner)) {
                endRunner--;
                continue;
            }

            char temp = chars[startRunner];
            chars[startRunner] = chars[endRunner];
            chars[endRunner] = temp;

            startRunner++;
            endRunner--;
        }

        return new String(chars);
    }

    private static boolean isNotVowel(String s, int startRunner) {
        return s.charAt(startRunner) != 'a' &&
                s.charAt(startRunner) != 'e' &&
                s.charAt(startRunner) != 'i' &&
                s.charAt(startRunner) != 'o' &&
                s.charAt(startRunner) != 'u' &&
                s.charAt(startRunner) != 'A' &&
                s.charAt(startRunner) != 'E' &&
                s.charAt(startRunner) != 'I' &&
                s.charAt(startRunner) != 'O' &&
                s.charAt(startRunner) != 'U';
    }


    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("aA"));
    }
}
