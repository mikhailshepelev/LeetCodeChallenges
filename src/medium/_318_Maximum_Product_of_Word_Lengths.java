package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _318_Maximum_Product_of_Word_Lengths {
    public static int maxProduct(String[] words) {
        Arrays.sort(words, (o1, o2) -> o2.length() - o1.length());

        int maxProduct = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() * words[i].length() < maxProduct) {
                break;
            }
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < words[i].length(); j++) {
                set.add(words[i].charAt(j));
            }

            for (int k = i+1; k < words.length; k++) {
                if (words[i].length() * words[k].length() < maxProduct) {
                    continue;
                }
                for (int m = 0; m < words[k].length(); m++) {
                    if (set.contains(words[k].charAt(m))) {
                        break;
                    }
                    if (m == words[k].length() - 1) {
                        int product = words[i].length() * words[k].length();
                        maxProduct = Math.max(product, maxProduct);
                    }
                }
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new String[] {"abcw","baz","foo","bar","xtfn","abcdef"}));
        System.out.println(maxProduct(new String[] {"a","ab","abc","d","cd","bcd","abcd"}));
        System.out.println(maxProduct(new String[] {"a","ab","abc","abcd","abcde","abcdef","abcdefg","abcdefgh","abcdefghi","abcdefghij","abcdefghijk","abcdefghijkl","abcdefghijklm","nopqrstuvwxyz","mnopqrstuvwxyz","lmnopqrstuvwxyz","klmnopqrstuvwxyz","jklmnopqrstuvwxyz","ijklmnopqrstuvwxyz","hijklmnopqrstuvwxyz","ghijklmnopqrstuvwxyz","fghijklmnopqrstuvwxyz","efghijklmnopqrstuvwxyz","defghijklmnopqrstuvwxyz","cdefghijklmnopqrstuvwxyz","bcdefghijklmnopqrstuvwxyz"}));

    }
}
