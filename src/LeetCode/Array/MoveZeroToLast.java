package LeetCode.Array;

public class MoveZeroToLast {
    public static void main(String[] args) {
        moveZeroes(new int[]{1, 0, 3, 0, 12});
    }

    public static void moveZeroes(int[] nums) {
        int pos=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0) {
                nums[pos]=nums[i];
                pos++;
            }
        }
        for (;pos<nums.length;pos++){
            nums[pos]=0;
        }
    }
}
