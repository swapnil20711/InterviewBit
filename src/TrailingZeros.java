public class TrailingZeros {
    public static void main(String[] args) {
        System.out.println(solve(18));

    }

    public static int solve(int A) {
        int count = 0;
        while (A != 0) {
            int res = A & 1;
            if (res != 1) {
                count++;
            } else
                break;
            A = A >> 1;
        }
        return count;
    }
}
