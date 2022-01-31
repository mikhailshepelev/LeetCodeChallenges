import java.util.Arrays;

public class Sum_Elements_In_Array_Recursion {

    public static int sum(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{2,4,6}));
    }
}
