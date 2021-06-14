package easy;

import java.util.Arrays;
import java.util.Comparator;

public class _1710_Maximum_Units_on_a_Truck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingInt((int[] arr) -> arr[1]).reversed());

        int i = 0, maxUnits = 0;

        while (truckSize > 0 && i < boxTypes.length) {
            if (truckSize >= boxTypes[i][0]) {
                maxUnits += (boxTypes[i][0] * boxTypes[i][1]);
            } else {
                maxUnits += (truckSize * boxTypes[i][1]);
            }
            truckSize -= boxTypes[i][0];
            i++;
        }

        return maxUnits;
    }

    public static void main(String[] args) {
        System.out.println(maximumUnits(new int[][] {{1,3},{2,2},{3,1}}, 4));
        System.out.println(maximumUnits(new int[][] {{5,10},{2,5},{4,7},{3,9}}, 10));
        System.out.println(maximumUnits(new int[][] {{1,3},{5,5},{2,5},{4,2},{4,1},{3,1},{2,2},{1,3},{2,5},{3,2}}, 35));
    }
}
