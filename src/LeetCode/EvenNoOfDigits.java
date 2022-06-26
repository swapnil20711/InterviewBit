package LeetCode;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{5545, 901, 482, 1771}));
    }

    public static int findNumbers(int[] nums) {
        int evenNumberDigitCount = 0;
        for (int i : nums) {
            if (countNumberOfDigits(i) % 2 == 0) {
                evenNumberDigitCount++;
            }
        }
        return evenNumberDigitCount;
    }

    private static int countNumberOfDigits(int i) {
        int count = 0;
        while (i != 0) {
            i /= 10;
            count++;
        }
        return count;
    }
}
