import java.util.Arrays;

public class Count_Elements_In_Array_Recursion {
    public static int count(int[] arr) {
        if (arr.length == 1) {
            return 1;
        }
        return 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{2,4,6,7,9,6}));
    }
}
