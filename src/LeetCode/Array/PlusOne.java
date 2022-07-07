package LeetCode.Array;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{8, 9, 5, 9}));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                System.out.println(digits[i]);
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] ret = new int[digits.length + 1];
        ret[0] = 1;
        return ret;
    }
}
