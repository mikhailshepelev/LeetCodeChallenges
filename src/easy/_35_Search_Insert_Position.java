package easy;

public class _35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int middleIndex = (low + high) / 2;
            int middleNumber = nums[middleIndex];

            if (target == middleNumber) return middleIndex;
            if (target < middleNumber) {
                high = middleIndex - 1;
            } else {
                low = middleIndex + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
    }
}
