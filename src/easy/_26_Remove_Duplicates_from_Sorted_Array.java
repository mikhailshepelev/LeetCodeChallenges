package easy;

public class _26_Remove_Duplicates_from_Sorted_Array {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,1,2}));
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
        System.out.println(1112 / 10);
    }
}
