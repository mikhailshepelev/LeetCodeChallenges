package easy;

import java.util.ArrayList;
import java.util.List;

public class _119_Pascals_Triangle_II {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; ++i) {
            result.add(1);
        }
        for (int i = 1; i < rowIndex; ++i) {
            for (int j = i; j > 0; --j) {
                result.set(j, result.get(j-1) + result.get(j));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getRow(6));
        System.out.println(getRow(0));
        System.out.println(getRow(1));
    }
}
