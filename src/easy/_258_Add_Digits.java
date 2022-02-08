package easy;

/*Digital root solution gives O(1) time complexity
* return num == 0 ? 0 : 1 + (num - 1) % 9;
* */
public class _258_Add_Digits {
    public static int addDigits(int num) {
        int root = 0;

        while (num > 0 || root > 9)
        {
            if (num == 0) {
                num = root;
                root = 0;
            }

            root += num % 10;
            num /= 10;
        }
        return root;
    }
    public static void main(String[] args) {
        System.out.println(addDigits(385554));
    }
}
