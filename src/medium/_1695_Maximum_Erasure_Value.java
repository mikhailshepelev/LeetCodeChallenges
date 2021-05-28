package medium;

import java.util.HashSet;
import java.util.Set;
/*
* Two pointers concept implemented here
* https://www.geeksforgeeks.org/two-pointers-technique/
* https://medium.com/swlh/two-pointer-technique-solving-array-problems-at-light-speed-56a77ee83d16
* */
public class _1695_Maximum_Erasure_Value {
    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int rightPointer = 0, leftPointer = 0;
        int currentScore = 0, maxScore = 0;

        while (leftPointer < nums.length && rightPointer < nums.length) {
            if (!set.contains(nums[rightPointer])) {
                set.add(nums[rightPointer]);
                currentScore += nums[rightPointer];
                maxScore = Math.max(currentScore, maxScore);
                rightPointer++;
            } else {
                set.remove(nums[leftPointer]);
                currentScore -= nums[leftPointer];
                leftPointer++;
            }
        }

        return maxScore;
    }

    public static void main(String[] args) {
        System.out.println(maximumUniqueSubarray(new int[] {4,2,4,5,6}));
        System.out.println(maximumUniqueSubarray(new int[] {5,2,1,2,5,2,1,2,5}));
    }
}
