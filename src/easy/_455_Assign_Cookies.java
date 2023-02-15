package easy;

import java.util.Arrays;

public class _455_Assign_Cookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;
        int sPointer = 0;
        for (int k : g) {
            for (int j = sPointer; j < s.length; j++) {
                if (s[j] >= k) {
                    result++;
                    sPointer = j + 1;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
        System.out.println(findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
        System.out.println(findContentChildren(new int[]{250,490,328,149,495,325,314,360,333,418,430,458}, new int[]{376,71,228,110,215,410,363,135,508,268,494,288,24}));
    }
}
