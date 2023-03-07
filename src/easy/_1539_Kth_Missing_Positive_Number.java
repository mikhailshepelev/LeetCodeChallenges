package easy;

public class _1539_Kth_Missing_Positive_Number {
    public static int findKthPositive(int[] arr, int k) {
        int current = 1;
        int counter = 0;
        int arrayPointerIndex = 0;

        while (counter < k) {
            if (arrayPointerIndex < arr.length && arr[arrayPointerIndex] == current) {
                arrayPointerIndex++;
                current++;
                continue;
            }

            counter++;
            if (counter == k) return current;
            else current++;
        }

        return current;
    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2,3,4,7,11}, 5));
        System.out.println(findKthPositive(new int[]{1,2,3,4}, 2));
        System.out.println(findKthPositive(new int[]{1,2}, 1));
    }
}
