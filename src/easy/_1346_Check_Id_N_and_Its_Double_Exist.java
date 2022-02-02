package easy;

import java.util.*;

public class _1346_Check_Id_N_and_Its_Double_Exist {
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) return true;
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[] {10,2,5,3}));
        System.out.println(checkIfExist(new int[] {7,1,14,11}));
        System.out.println(checkIfExist(new int[] {-2,0,10,-19,4,6,-8}));
    }
}
