package easy;

import java.util.Arrays;

public class _561_Array_Partition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 1; i < nums.length; i += 2) {
            sum += (Math.min(nums[i-1], nums[i]));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[] {1,4,3,2}));
        System.out.println(arrayPairSum(new int[] {6,2,6,5,1,2}));
    }
}
