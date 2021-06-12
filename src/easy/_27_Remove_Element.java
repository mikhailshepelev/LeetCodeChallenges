package easy;

/*
* Two pointers technique implemented here
* */

public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int nonValPointer = nums.length - 1;
        int valPointer = nums.length - 1;
        while (valPointer >= 0) {
            if (nums[nonValPointer] == val) {
                nonValPointer = Math.max(0, --nonValPointer);
            }

            if (nums[valPointer] == val) {
                count++;
            } else {
                valPointer--;
                continue;
            }

            if (valPointer <= nonValPointer) {
                nums[valPointer] = nums[nonValPointer];
                nums[nonValPointer] = val;
                nonValPointer--;
            }
            valPointer--;
        }

        return nums.length - count;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {3,2,2,3}, 3));
        System.out.println(removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
        System.out.println(removeElement(new int[] {1}, 1));
    }
}
