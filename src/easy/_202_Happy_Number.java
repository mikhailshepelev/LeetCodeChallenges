package easy;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/happy-number/solution/
Another implementation is Floyd's Cycle Finding algorithm with 2 runners - one with 2 steps forward and
* one with 1 step forward. If there is no cycle, fast runner eventually get to 1 first. If there is cycle,
* both runners eventually reach same number*/
public class _202_Happy_Number {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) return false;
            set.add(n);
            int remainder = n;
            int sum = 0;
            while (remainder > 0) {
                int lastDigit = remainder % 10;
                sum += Math.pow(lastDigit, 2);
                remainder /= 10;
            }
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        System.out.println(isHappy(7));
        System.out.println(isHappy(3));
    }
}
