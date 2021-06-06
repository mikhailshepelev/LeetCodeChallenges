package medium;

import java.util.HashSet;
import java.util.Set;

/*
* Algorithm complexity is O(n)
* Standard brute force approach improved by HashSet implementation which allows O(1) lookups
* Also 21-23 rows allows to skip processing of set values that are in the middle of sequences
* */
public class _128_Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestSequence = 0;

        for (int num : set) {

            if (set.contains(num - 1)) {
                continue;
            }

            int currentSequence = 1;
            int currentValue = num;

            while (set.contains(currentValue + 1)) {
                currentValue++;
                currentSequence++;
            }

            longestSequence = Math.max(currentSequence, longestSequence);
        }

        return longestSequence;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] {100,4,200,1,3,2})); // expected - 4
        System.out.println(longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1})); // expected - 9
    }
}
