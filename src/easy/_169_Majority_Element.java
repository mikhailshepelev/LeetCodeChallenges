package easy;

import java.util.*;

/*Boyer-Moore voting algorithm allows O(n) time complexity and O(1) space complexity*/
public class _169_Majority_Element {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            if (map.containsKey(i)) {
                int oldValue = map.get(i);
                map.replace(i, ++oldValue);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length/2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
