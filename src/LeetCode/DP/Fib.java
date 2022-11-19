package LeetCode.DP;

import java.util.Arrays;

public class Fib {
    public static void main(String[] args) {
        int n = 44;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        fibOptimal(n);
        System.out.println(fib(n, dp));
    }

    /*
     * TC O(N)
     * SC O(N)+O(N)*/
    public static int fib(int n, int dp[]) {
        if (n <= 1)
            return n;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    /*
     * TC:O(N)
     * SC:O(1)*/
    public static void fibOptimal(int n) {
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 2; i <= n; i++) {
            int current = prev2 + prev1;
            prev2 = prev1;
            prev1 = current;
        }
        System.out.println(prev1 + prev2);
    }
}
