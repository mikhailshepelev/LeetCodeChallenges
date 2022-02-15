package easy;

import java.util.*;

/*Most optimal solution for this task is with XOR usage*/
public class _136_Single_Number {
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (Integer i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        return set.stream().findFirst().isPresent() ? set.stream().findFirst().get() : -1;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{2,2,1}));
    }
}
