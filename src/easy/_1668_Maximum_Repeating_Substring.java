package easy;

public class _1668_Maximum_Repeating_Substring {
    public static int maxRepeating(String sequence, String word) {
        int ans = 0;
        StringBuilder sb = new StringBuilder(word);
        while (sequence.contains(sb)) {
            ans++;
            sb.append(word);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxRepeating("ababc", "ab"));
        System.out.println(maxRepeating("ababc", "ba"));
        System.out.println(maxRepeating("ababc", "ac"));
    }
}
