package easy;

public class _485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxScore = 0;
        int currentScore = 0;

        for (int num : nums) {
            if (num == 1) {
                currentScore++;
                maxScore = Math.max(maxScore, currentScore);
            } else {
                currentScore = 0;
            }
        }

        return maxScore;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1})); // 3
        System.out.println(findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1})); // 2
    }
}
