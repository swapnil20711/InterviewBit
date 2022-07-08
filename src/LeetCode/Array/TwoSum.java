package LeetCode.Array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{3,3},6));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i,nums[i]);
        }
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsValue(target - nums[i])) {
                res[0] = i;
            }
        }
        return res;
    }
}
