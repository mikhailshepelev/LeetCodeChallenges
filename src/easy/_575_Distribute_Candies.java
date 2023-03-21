package easy;

import java.util.HashSet;
import java.util.Set;

public class _575_Distribute_Candies {
    public static int distributeCandies(int[] candyType) {
        int max = candyType.length / 2;
        Set<Integer> eatenTypes = new HashSet<>();
        for (Integer type: candyType) {
            if (eatenTypes.size() >= max) return eatenTypes.size();

            eatenTypes.add(type);
        }

        return eatenTypes.size();
    }

    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1,1,2,2,3,3}));
        System.out.println(distributeCandies(new int[]{1,1,2,3}));
        System.out.println(distributeCandies(new int[]{6,6,6,6}));
    }
}
