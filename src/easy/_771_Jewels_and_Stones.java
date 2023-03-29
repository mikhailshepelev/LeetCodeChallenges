package easy;

import java.util.HashSet;
import java.util.Set;

public class _771_Jewels_and_Stones {
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> jew = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            jew.add(jewels.charAt(i));
        }
        int ans = 0;
        for (char c : stones.toCharArray()) {
            if (jew.contains(c)) ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}
