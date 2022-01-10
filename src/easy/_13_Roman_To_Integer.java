package easy;

import java.util.Map;

public class _13_Roman_To_Integer {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = Map.of(
                'I',1,
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000
        );

        if (s.length() == 1) {
            return romanNumerals.get(s.charAt(0));
        }

        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            int previous = romanNumerals.get(s.charAt(i - 1));
            int current = romanNumerals.get(s.charAt(i));
            if (previous < current) {
                result -= previous;
            } else {
                result += previous;
            }

            if (i == s.length() - 1) {
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}

