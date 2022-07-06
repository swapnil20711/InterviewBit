package LeetCode.Array;

public class RunningSum {
    public static void main(String[] args) {
        System.out.println(runningSum(new int[]{1,2,3,4}));
    }

    public static int[] runningSum(int[] nums) {
        int resArray[] = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            resArray[i] = sum;
        }
        return resArray;
    }
}
