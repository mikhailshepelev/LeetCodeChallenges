package easy;

public class _58_Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        String[] splitedString = s.split(" ");

        if (splitedString.length == 0) {
            return 0;
        }

        return splitedString[splitedString.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord(" "));
    }
}
