package easy;

/*
* Dynamic programming approach
* Time complexity O(n), space complexity O(1)
* */
public class _746_Min_Cost_Climbing_Stairs {
    public int minCostClimbingStairs(int[] cost) {
        int previousFirst = 0;
        int previousSecond = 0;

        for (int i = 2; i < cost.length + 1; i++) {
            int temp = previousFirst;
            previousFirst = Math.min(previousFirst + cost[i - 1], previousSecond + cost[i - 2]);
            previousSecond = temp;
        }

        return previousFirst;
    }
}
