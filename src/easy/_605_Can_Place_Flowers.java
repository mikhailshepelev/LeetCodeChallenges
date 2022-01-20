package easy;

public class _605_Can_Place_Flowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if ((i - 1 >= 0 && flowerbed[i-1] == 1) || (i + 1 <= flowerbed.length - 1 && flowerbed[i+1] == 1)) {
                    continue;
                }
                flowerbed[i] = 1;
                n--;

            }
        }
        return n<=0;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }
}
