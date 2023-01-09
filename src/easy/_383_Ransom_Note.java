package easy;

import java.util.HashMap;
import java.util.Map;

public class _383_Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : magazine.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        for (Character c : ransomNote.toCharArray()) {
            if (map.containsKey(c) && map.get(c) != 0) map.put(c, map.get(c) - 1);
            else return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
}
