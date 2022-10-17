package medium;

import java.util.*;

public class _49_Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String actualStr : strs) {
            String sortedStr = sortString(actualStr);
            if (anagrams.containsKey(sortedStr)) {
                anagrams.get(sortedStr).add(actualStr);
            } else {
                anagrams.put(sortedStr, new ArrayList<>(List.of(actualStr)));
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> map : anagrams.entrySet()) {
            result.add(map.getValue());
        }

        return result;
    }

    private static String sortString(String str) {
        char[] tempArray = str.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String[] args){
        List<List<String>> test1 = groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
        for (List<String> strings : test1) {
            System.out.print(Arrays.toString(strings.toArray()));
        }
        System.out.println();

        List<List<String>> test2 = groupAnagrams(new String[] {""});
        for (List<String> strings : test2) {
            System.out.print(Arrays.toString(strings.toArray()));
        }
        System.out.println();

        List<List<String>> test3 = groupAnagrams(new String[] {"a"});
        for (List<String> strings : test3) {
            System.out.print(Arrays.toString(strings.toArray()));
        }
        System.out.println();
    }
}