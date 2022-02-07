package easy;

import java.util.Arrays;

public class _283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int writePointer = 0;
        int readPointer = 0;
        while (readPointer < nums.length) {
            if (nums[readPointer] == 0) {
                readPointer++;
                continue;
            }
            nums[writePointer] = nums[readPointer];
            writePointer++;
            readPointer++;
        }

        for (int i = writePointer; i < nums.length; i++) {
            nums[writePointer] = 0;
            writePointer++;
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[] {16,0,1,0,3,12});
        moveZeroes(new int[] {0});
    }
}
