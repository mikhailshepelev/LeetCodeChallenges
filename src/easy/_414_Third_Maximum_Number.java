package easy;

public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        for (int num : nums) {
            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
                continue;
            } else if (num != firstMax && (secondMax == null || num > secondMax)) {
                thirdMax = secondMax;
                secondMax = num;
                continue;
            } else if (num != firstMax && num != secondMax && (thirdMax == null || num > thirdMax)) {
                thirdMax = num;
            }
        }

        return thirdMax != null ? thirdMax : firstMax;
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[] {3,2,1}));
        System.out.println(thirdMax(new int[] {1,2}));
        System.out.println(thirdMax(new int[] {2,2,3,1}));
        System.out.println(thirdMax(new int[] {5,2,2}));
        System.out.println(thirdMax(new int[] {2,2,3,1}));
        System.out.println(thirdMax(new int[] {1,2,2,5,3,5}));
        System.out.println(thirdMax(new int[] {1,2,-2147483648}));
    }
}
