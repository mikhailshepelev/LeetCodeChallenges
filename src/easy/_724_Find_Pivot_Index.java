package easy;

import java.util.stream.IntStream;

public class _724_Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = IntStream.of(nums).sum();

        for (int i = 0; i < nums.length; i++) {
            if (i != 0) leftSum += nums[i-1];
            rightSum -= nums[i];

            if (leftSum == rightSum) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] {1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[] {1,2,3}));
        System.out.println(pivotIndex(new int[] {2,1,-1}));
    }
}
