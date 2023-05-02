package easy;

public class _1822_Sign_of_the_Product_of_an_Array {
    public static int arraySign(int[] nums) {
        int negativesAmount = 0;
        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) negativesAmount++;
        }
        return negativesAmount % 2 == 0 ? 1 : -1;
    }

    public static void main(String[] args) {
        System.out.println(arraySign(new int[]{-1,-2,-3,-4,3,2,1}));
        System.out.println(arraySign(new int[]{1,5,0,2,-3}));
        System.out.println(arraySign(new int[]{-1,1,-1,1,-1}));
    }
}
