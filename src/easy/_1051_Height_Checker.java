package easy;

import java.util.*;

/*Smart solution without sorting can be found it we count the frequency of each height in array
* using HashTable or array of heights
* */
public class _1051_Height_Checker {
    public static int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted);

        int num = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) num++;
        }

        return num;
    }
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
        System.out.println(heightChecker(new int[]{5,1,2,3,4}));
        System.out.println(heightChecker(new int[]{1,2,3,4,5}));
    }
}
