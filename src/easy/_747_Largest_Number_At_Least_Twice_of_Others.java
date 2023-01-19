package easy;

public class _747_Largest_Number_At_Least_Twice_of_Others {
    public static int dominantIndex(int[] nums) {
        int highest = -1;
        int second = -1;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > highest) {
                second = highest;
                highest = nums[i];
                index = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }
        if (highest >= second * 2) {
            return index;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[] {3,6,1,0}));
        System.out.println(dominantIndex(new int[] {1,2,3,4}));
    }
}
