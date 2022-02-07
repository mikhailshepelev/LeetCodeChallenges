package easy;

import java.util.Arrays;

/*Time complexity: O(n)
* Space complexity: O(1)
*/
public class _905_Sort_Array_By_Parity {

    public static int[] sortArrayByParity(int[] nums) {
        int evenPointer = 0;
        int oddPointer = nums.length - 1;
        while (evenPointer < oddPointer) {
            if (nums[oddPointer] % 2 != 0) {
                oddPointer--;
                continue;
            }
            if (nums[evenPointer] % 2 == 0) {
                evenPointer++;
                continue;
            }
            int temp = nums[evenPointer];
            nums[evenPointer] = nums[oddPointer];
            nums[oddPointer] = temp;
            oddPointer--;
            evenPointer++;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3,1,2,4})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0})));
    }
}
