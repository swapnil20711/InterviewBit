public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-1235455124));

    }

    public static long reverse(long A) {
        long sum = 0;
        while (A != 0) {
            if (sum >= Integer.MAX_VALUE / 10 || sum <= Integer.MIN_VALUE / 10) {
                return 0;
            }
            long rem = A % 10;
            sum = rem + sum * 10;
            A /= 10;
        }
        return sum;
    }
}
