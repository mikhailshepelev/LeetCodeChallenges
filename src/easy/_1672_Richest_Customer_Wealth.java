package easy;

public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int col = 0; col < account.length; col++) {
                sum += account[col];
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1,2,3}, {3,2,1}}));
        System.out.println(maximumWealth(new int[][]{{1,5}, {7,3}, {3,5}}));
    }
}
