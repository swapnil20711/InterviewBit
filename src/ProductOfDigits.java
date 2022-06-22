public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(solve(123));
    }

    public static int solve(int A) {
        int res = 1;
        if (A == 0)
            return 0;
        else {
            while (A != 0) {
                int rem = A % 10;
                res *= rem;
                A /= 10;
            }
        }
        return res;
    }
}
