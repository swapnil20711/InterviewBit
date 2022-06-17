import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 1, 1, 2, 2}));
    }

    public static int majorityElement(final int[] A) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        int maxKey = 0;
        int maxNum = 0;
        for (int i : A) {
            if (nums.containsKey(i)) {
                int value = nums.get(i);
                nums.put(i, ++value);
            } else {
                nums.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : nums.entrySet()) {
            if (entry.getValue() >= maxNum) {
                maxNum = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        if (maxNum > Math.floor(A.length / 2.0))
            return maxKey;
        else
            return -1;
    }
}
