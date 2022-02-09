package easy;

import java.util.*;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) continue;
            int j = nums[i] - 1;
            while (nums[j] != -1) {
                int temp = nums[j];
                nums[j] = -1;
                j = temp - 1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) list.add(i + 1);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }
}
