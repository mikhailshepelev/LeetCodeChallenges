package easy;

public class _1893_Check_if_All_the_Integers_in_a_Range_Are_Covered {
    public static boolean isCovered(int[][] ranges, int left, int right) {
        while (left <= right) {
            boolean isCovered = false;

            for (int[] range : ranges) {
                if (left >= range[0] && left <= range[1]) {
                    left++;
                    isCovered = true;
                    break;
                }
            }

            if (!isCovered) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isCovered(new int[][] {{1,2},{3,4},{5,6}}, 2, 5)); // true
        System.out.println(isCovered(new int[][] {{1,10},{10,20}}, 21, 21)); // false
    }
}
