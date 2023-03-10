package easy;

public class _415_Add_Strings {
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int num1Pointer = num1.length() - 1;
        int num2Pointer = num2.length() - 1;
        boolean carryOver = false;
        while (num1Pointer >= 0 || num2Pointer >= 0) {
            int sum = 0;
            if (num1Pointer >= 0) {
                int a = num1.charAt(num1Pointer--) - 48;
                sum += a;
            }
            if (num2Pointer >= 0) {
                int b = num2.charAt(num2Pointer--) - 48;
                sum += b;
            }
            if (carryOver) {
                sum += 1;
            }
            if (sum >= 10) {
                carryOver = true;
                sb.append((sum % 10));
            } else {
                carryOver = false;
                sb.append(sum);
            }
        }
        if (carryOver) sb.append(1);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
        System.out.println(addStrings("456", "77"));
        System.out.println(addStrings("6913259244", "71103343"));
    }
}
