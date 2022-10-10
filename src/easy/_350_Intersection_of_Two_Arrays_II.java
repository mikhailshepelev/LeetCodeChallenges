package easy;

import java.util.*;

public class _350_Intersection_of_Two_Arrays_II {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Distinct = new HashMap<>();
        for (Integer i : nums1) {
            if (nums1Distinct.containsKey(i)) {
                int value = nums1Distinct.get(i);
                nums1Distinct.put(i, value + 1);
            } else {
                nums1Distinct.put(i, 1);
            }
        }

        Map<Integer, Integer> intersection = new HashMap<>();
        for (Integer i : nums2) {
            if (nums1Distinct.containsKey(i)) {
                int val = nums1Distinct.get(i);
                nums1Distinct.put(i, val - 1 );
                if (nums1Distinct.get(i) == 0) nums1Distinct.remove(i);
                if (intersection.containsKey(i)) {
                    int intVal = intersection.get(i);
                    intersection.put(i, intVal + 1);
                } else {
                    intersection.put(i, 1);
                }
            }
        }

        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : intersection.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                list.add(entry.getKey());
            }
        }

        int[] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++) array[i] = list.get(i);

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
