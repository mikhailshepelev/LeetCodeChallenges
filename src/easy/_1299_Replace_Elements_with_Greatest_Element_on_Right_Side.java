package easy;

import java.util.Arrays;

public class _1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 == arr.length) {
                arr[i] = -1;
            }
            else {
                int j = i + 1;
                int max = arr[j];
                while (j < arr.length) {
                    max = Math.max(max, arr[j++]);
                }
                arr[i] = max;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[] {17,18,5,4,6,1})));
    }
}
