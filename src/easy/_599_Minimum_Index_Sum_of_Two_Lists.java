package easy;

import java.util.*;

public class _599_Minimum_Index_Sum_of_Two_Lists {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> list1Map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            list1Map.put(list1[i], i);
        }

        int minIndexSum = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < list2.length; i++) {
            String str = list2[i];
            if (list1Map.containsKey(str)) {
                int tempIndexSum =  i + list1Map.get(str);
                if (tempIndexSum < minIndexSum) {
                    list.clear();
                    list.add(str);
                    minIndexSum = tempIndexSum;
                } else if (tempIndexSum == minIndexSum) {
                    list.add(str);
                }
            }
        }

        return list.toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        findRestaurant(
                                new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                                new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}
                        )));
        System.out.println(
                Arrays.toString(
                        findRestaurant(
                                new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                                new String[]{"KFC","Shogun","Burger King"}
                        )));
        System.out.println(
                Arrays.toString(
                        findRestaurant(
                                new String[]{"happy","sad","good"},
                                new String[]{"sad","happy","good"}
                        )));
    }
}
