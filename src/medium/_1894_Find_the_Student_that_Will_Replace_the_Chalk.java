package medium;

public class _1894_Find_the_Student_that_Will_Replace_the_Chalk {

    public static int chalkReplacer(int[] chalk, int k) {

        int sum = 0;
        for (int i = 0; i < chalk.length; ++i) {
            sum += chalk[i];
            k -= chalk[i];
            if (k < 0) {
                return i;
            }
        }
        k %= sum;
        for (int i = 0; i < chalk.length; ++i) {
            k -= chalk[i];
            if (k < 0) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(chalkReplacer(new int[] {5,1,5}, 22));
        System.out.println(chalkReplacer(new int[] {3,4,1,2}, 25));
    }
}
