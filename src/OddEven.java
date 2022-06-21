public class OddEven {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3}, 31, 100));
    }

    public static int solve(int[] A, int B, int C) {
        int whatDayItIs = B % 2;
        int fine = 0;
        for (int lastDigit : A) {
            if (lastDigit % 2 != whatDayItIs) {
                fine += C;
            }
        }
        return fine;
    }
}
