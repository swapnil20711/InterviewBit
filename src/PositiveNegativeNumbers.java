public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, -2, 3}).toString());
    }

    public static int[] solve(int[] A) {
        int ans[] = new int[2];
        int positiveCount = 0, negativeCount = 0;
        for (int num : A) {
            if (num < 0 && num != 0)
                negativeCount++;
            if (num > 0 && num != 0)
                positiveCount++;
        }
        ans[0] = positiveCount;
        ans[1] = negativeCount;
        return ans;
    }

}
