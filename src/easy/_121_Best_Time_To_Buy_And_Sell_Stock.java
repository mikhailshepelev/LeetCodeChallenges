package easy;

public class _121_Best_Time_To_Buy_And_Sell_Stock {
    public static int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;

        int buy = 0;
        int sell = 1;
        int maxProfit = 0;

        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            }
            else {
                buy = sell;
            }
            sell++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(maxProfit(new int[]{1,2,4}));
        System.out.println(maxProfit(new int[]{3,2,6,6,0,3}));
    }

}
