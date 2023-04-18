package medium;

import java.util.HashSet;
import java.util.Set;

public class _2405_Optimal_Partition_of_String {
    public static int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                ans++;
                set.clear();
            } else {
                set.add(s.charAt(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
        System.out.println(partitionString("ssssss"));
    }
}
