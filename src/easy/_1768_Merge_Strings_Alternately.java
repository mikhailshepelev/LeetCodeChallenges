package easy;

public class _1768_Merge_Strings_Alternately {
    public static String mergeAlternately(String word1, String word2) {
        int indexPointer = 0;
        StringBuilder ans = new StringBuilder();

        while (indexPointer < word1.length() && indexPointer < word2.length()) {
            ans.append(word1.charAt(indexPointer));
            ans.append(word2.charAt(indexPointer++));

            if (indexPointer >= word1.length()) ans.append(word2.substring(indexPointer));
            else if (indexPointer >= word2.length()) ans.append(word1.substring(indexPointer));
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}
