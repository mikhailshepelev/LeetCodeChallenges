package easy;

public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3 || arr[1] <= arr[0]) return false;

        boolean topReached = false;
        for (int i = 2; i < arr.length; i++) {
            if (!topReached && arr[i] < arr[i-1]) {
                topReached = true;
            }

            if (!topReached && arr[i] <= arr[i-1]) {
                return false;
            }
            if (topReached && arr[i] >= arr[i-1]) {
                return false;
            }
        }
        return arr[arr.length - 2] > arr[arr.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{2,1}));
        System.out.println(validMountainArray(new int[]{3,5,5}));
        System.out.println(validMountainArray(new int[]{0,3,2,1}));
        System.out.println(validMountainArray(new int[]{0,2,3,4,5,2,1,0}));
        System.out.println(validMountainArray(new int[]{0,2,3,3,5,2,1,0}));
    }
}
