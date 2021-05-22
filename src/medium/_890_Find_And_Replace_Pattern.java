package medium;

import java.util.*;

public class _890_Find_And_Replace_Pattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> matchPatternWords = new ArrayList<>();

        for (String word : words) {
            if (matchPattern(word, pattern)) {
                matchPatternWords.add(word);
            }
        }

        return matchPatternWords;
    }

    private boolean matchPattern(String word, String pattern) {

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (!map.containsKey(w)) map.put(w, p);
            if (map.get(w) != p) return false;
        }

        boolean[] seen = new boolean[26];
        for (char p: map.values()) {
            if (seen[p - 'a']) return false;
            seen[p - 'a'] = true;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(new _890_Find_And_Replace_Pattern().findAndReplacePattern(
                new String[] {"a","b","c"}, "a"));
    }
}
