package easy;

import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {

    public static int[] sortedSquares(int[] nums) {
        int[] newArr = new int[nums.length];
        int currentIndexToInsert = newArr.length - 1;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                newArr[currentIndexToInsert] = nums[i] * nums[i];
                currentIndexToInsert--;
                i++;
            } else {
                newArr[currentIndexToInsert] = nums[j] * nums[j];
                currentIndexToInsert--;
                j--;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }
}
