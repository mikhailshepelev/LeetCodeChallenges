package easy;

public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstArrayPointer = m - 1;
        int secondArrayPointer = n - 1;

        for (int i = m + n - 1; i >=0 ; i--) {
            if (firstArrayPointer < 0) {
                nums1[i] = nums2[secondArrayPointer--];
                continue;
            } else if (secondArrayPointer < 0) {
                nums1[i] = nums1[firstArrayPointer--];
                continue;
            }
            if (nums1[firstArrayPointer] > nums2[secondArrayPointer]) {
                nums1[i] = nums1[firstArrayPointer--];
            } else if (nums1[firstArrayPointer] < nums2[secondArrayPointer]){
                nums1[i] = nums2[secondArrayPointer--];
            } else {
                nums1[i] = nums2[secondArrayPointer--];
            }
        }
    }

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        merge(new int[]{1}, 1, new int[]{}, 0);
    }
}
