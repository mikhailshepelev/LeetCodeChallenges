package easy;

public class _796_Rotate_String {
    public static boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        for (Character c : s.toCharArray()) {
            sb.append(c);
            sb.deleteCharAt(0);

            if (sb.toString().equals(goal)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("abcde", "abced"));
    }
}
