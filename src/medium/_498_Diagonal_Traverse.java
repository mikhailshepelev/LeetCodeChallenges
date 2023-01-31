package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO: not solved yet
public class _498_Diagonal_Traverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        int num = 2;
        int sumOfIndexes = 2;
        List<Integer> list = new ArrayList<>(mat.length * mat.length);
        int firstIndex = 0;
        int secondIndex = 0;
        list.add(mat[firstIndex][secondIndex]);
        boolean secondIndexShouldBeIncremented = true;
        while (num <= mat.length) {
            if (secondIndexShouldBeIncremented) {
                secondIndex ++;
                for (int i = 1; i <= sumOfIndexes; i++) {
                    list.add(mat[firstIndex][secondIndex]);
                    if (sumOfIndexes == i) break;
                    secondIndex --;
                    firstIndex ++;
                }
            } else {
                firstIndex ++;
                for (int i = 1; i <= sumOfIndexes; i++) {
                    list.add(mat[firstIndex][secondIndex]);
                    if (sumOfIndexes == i) break;
                    firstIndex --;
                    secondIndex ++;
                }
            }
            sumOfIndexes++;
            secondIndexShouldBeIncremented = !secondIndexShouldBeIncremented;
            num++;
        }

        while (num > 0) {
            if (secondIndexShouldBeIncremented) {
                secondIndex ++;
                for (int i = 1; i <= sumOfIndexes; i++) {
                    list.add(mat[firstIndex][secondIndex]);
                    if (sumOfIndexes == i) break;
                    secondIndex --;
                    firstIndex ++;
                }
            }
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }
}
