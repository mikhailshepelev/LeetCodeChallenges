package easy;

public class _1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static int numberOfSteps(int num) {
        if (num == 0) return 0;

        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps ++;
        }

        return steps;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));
    }
}
