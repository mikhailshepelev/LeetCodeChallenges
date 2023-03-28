package easy;

public class _657_Robot_Return_to_Origin {
    public static boolean judgeCircle(String moves) {
        int vertical = 0, gorizontal = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') vertical++;
            if (c == 'D') vertical--;
            if (c == 'R') gorizontal++;
            if (c == 'L') gorizontal--;
        }
        return vertical == 0 && gorizontal == 0;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }
}
