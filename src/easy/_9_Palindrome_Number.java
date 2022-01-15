package easy;

import java.util.ArrayList;
import java.util.List;

public class _9_Palindrome_Number {

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int initialNumber = x;
        List<Integer> list = new ArrayList<>();

        while (x >= 10) {
            list.add(x % 10);
            x /= 10;
        }
        list.add(x);

        int reversedNumber = 0, multiplier = 1;
        for (int i = list.size() - 1; i >= 0 ; i--) {
            reversedNumber += (list.get(i) * multiplier);
            multiplier *= 10;
        }

        return reversedNumber == initialNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12221));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
