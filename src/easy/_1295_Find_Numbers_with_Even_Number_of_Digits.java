package easy;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            int numberOfDigits = 0;
            while (num > 0) {
                num = num / 10;
                numberOfDigits++;
            }
            if (numberOfDigits % 2 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
        System.out.println(findNumbers(new int[]{555,901,482,1771}));
    }
}

