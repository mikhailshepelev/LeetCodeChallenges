package easy;

import java.util.HashMap;
import java.util.Map;

public class _242_Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap =  new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (sMap.containsKey(currentChar)) {
                int prevValue = sMap.get(currentChar);
                sMap.put(currentChar, ++prevValue);
            } else {
                sMap.put(currentChar, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char currentChar = t.charAt(i);
            if (!sMap.containsKey(currentChar)) return false;

            int prevValue = sMap.get(currentChar);
            if (prevValue == 1) {
                sMap.remove(currentChar);
            } else {
                sMap.put(currentChar, --prevValue);
            }
        }

        return sMap.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}
