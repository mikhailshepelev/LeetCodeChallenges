package easy;

import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        if (s.length() <= 1 || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char c = stack.pop();
                int abs = Math.abs(s.charAt(i) - c);
                if (abs > 2 || abs < 1) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("){"));
    }
}
