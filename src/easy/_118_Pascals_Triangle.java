package easy;

import java.util.ArrayList;
import java.util.List;

public class _118_Pascals_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>(i);
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    list.add(1);
                    if (j == i - 1) result.add(list);
                    continue;
                }
                list.add(result.get(i-2).get(j-1) + result.get(i-2).get(j));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generate(1));
    }
}
