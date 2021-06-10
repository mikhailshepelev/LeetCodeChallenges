package medium;

import java.util.TreeMap;

public class _729_My_Calendar_I {

    TreeMap<Integer, Integer> map = new TreeMap<>();

    public _729_My_Calendar_I() {
    }

    public boolean book(int start, int end) {
        Integer previous = map.floorKey(start);
        if (previous != null && map.get(previous) > start) {
            return false;
        }

        Integer next = map.ceilingKey(start);
        if (next != null && next < end) {
            return false;
        }

        map.put(start, end);

        return true;
    }

    public static void main(String[] args) {
        _729_My_Calendar_I obj = new _729_My_Calendar_I();
        System.out.println(obj.book(10, 20));
        System.out.println(obj.book(15, 25));
        System.out.println(obj.book(20, 30));
    }
}
