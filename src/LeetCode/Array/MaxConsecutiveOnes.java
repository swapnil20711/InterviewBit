package LeetCode.Array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0, count = 0;
        for (int num : nums) {
            //Increase the count if the number is 1
            if (num != 0) count++;
                //else make the count 0
            else count = 0;
            //find max of count and maxConsecutiveOnes
            maxConsecutiveOnes = Math.max(count, maxConsecutiveOnes);
        }
        return maxConsecutiveOnes;    }
}

