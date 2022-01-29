import java.util.Arrays;

public class Find_Max_Value_In_Array_Recursion {
    public static int sum(int[] arr) {
        if (arr.length == 2) {
            return Math.max(arr[0], arr[1]);
        }
        return Math.max(arr[0], sum(Arrays.copyOfRange(arr, 1, arr.length)));
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{2,4,44,7,9,6}));
    }
}

