package easy;

public class _67_Add_Binary {
    public static String addBinary(String a, String b) {
        int maxStrLength = Math.max(a.length(), b.length());
        char[] aStr = a.toCharArray();
        char[] bStr = b.toCharArray();
        int aCurrIndex = aStr.length - 1;
        int bCurrIndex = bStr.length - 1;
        boolean carryOver = false;
        StringBuilder sb = new StringBuilder();

        for (int i = maxStrLength - 1; i >= 0; i--) {
            int sum = 0;
            if (carryOver) {
                sum++;
            }
            if (aCurrIndex >= 0) {
                sum += Character.getNumericValue(aStr[aCurrIndex]);
                aCurrIndex--;
            }
            if (bCurrIndex >= 0) {
                sum += Character.getNumericValue(bStr[bCurrIndex]);
                bCurrIndex--;
            }

            if (sum == 3) {
                sb.append("1");
                carryOver = true;
            } else if (sum == 2) {
                sb.append("0");
                carryOver = true;
            } else if (sum == 1) {
                sb.append("1");
                carryOver = false;
            } else {
                sb.append("0");
                carryOver = false;
            }
        }

        if (carryOver) sb.append("1");

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }
}
