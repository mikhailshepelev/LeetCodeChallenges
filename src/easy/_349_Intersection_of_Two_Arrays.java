package easy;

import java.util.*;

public class _349_Intersection_of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Distinct = new HashSet<>();
        for (Integer i : nums1) nums1Distinct.add(i);

        Set<Integer> intersectionSet = new HashSet<>();
        for (Integer i : nums2) {
            if (nums1Distinct.contains(i)) intersectionSet.add(i);
        }
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (Integer i : intersectionSet) {
            result[index++] = i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
