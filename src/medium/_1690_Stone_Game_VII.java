package medium;

public class _1690_Stone_Game_VII {
    public static int stoneGameVII(int[] stones) {
        int bobScore = 0;
        int aliceScore = 0;

        int i = 0;
        int j = stones.length - 1;


        if (stones[i] > stones[j]) {
            j--;
        } else {
            i++;
        }
        int multiplier = 1;
        boolean aliceTurn = false;

        while (i != j) {
            if (aliceTurn) {
                if (stones[i] > stones[j]) {
                    aliceScore = aliceScore + (stones[j] * (multiplier - 1));
                    bobScore = bobScore + (stones[j] * multiplier);
                    j--;
                } else {
                    aliceScore = aliceScore + (stones[i] * (multiplier - 1));
                    bobScore = bobScore + (stones[i] * multiplier);
                    i++;
                }
            } else {
                if (stones[i] > stones[j]) {
                    aliceScore = aliceScore + (stones[i] * multiplier);
                    bobScore = bobScore + (stones[i] * (multiplier - 1));
                    i++;
                } else {
                    aliceScore = aliceScore + (stones[j] * multiplier);
                    bobScore = bobScore + (stones[j] * (multiplier - 1));
                    j--;
                }
            }

            multiplier++;
            aliceTurn = !aliceTurn;
        }

        return Math.abs(aliceScore - bobScore);
    }

    public static void main(String[] args) {
        System.out.println(stoneGameVII(new int[] {5,3,1,4,2}));
        System.out.println(stoneGameVII(new int[] {7,90,5,1,100,10,10,2}));
    }
}
