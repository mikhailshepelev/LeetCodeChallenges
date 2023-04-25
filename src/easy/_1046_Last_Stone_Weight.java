package easy;

import java.util.PriorityQueue;

public class _1046_Last_Stone_Weight {
    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];
        PriorityQueue<Integer> queue = new PriorityQueue<>(stones.length);

        for(int i : stones) {
            queue.add(-i);
        }

        while (queue.size() > 1) {
            int first = -queue.remove();
            int second = -queue.remove();

            if (first != second) queue.add(-Math.abs(first - second));
        }

        return queue.size() == 1 ? -queue.remove() : 0;
    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
        System.out.println(lastStoneWeight(new int[]{1}));
        System.out.println(lastStoneWeight(new int[]{3,7,2}));
    }
}
