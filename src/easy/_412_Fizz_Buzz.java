package easy;

import java.util.ArrayList;
import java.util.List;

public class _412_Fizz_Buzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder word = new StringBuilder();
            if (i % 3 == 0) word.append("Fizz");
            if (i % 5 == 0) word.append("Buzz");
            if (word.length() == 0) list.add(Integer.toString(i));
            else list.add(word.toString());
        }
        return list;
    }
}
