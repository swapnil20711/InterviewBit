package LeetCode.GfgTest;

import java.util.Arrays;

public class PoliceStation {
    public static void main(String[] args) {
        System.out.println(solve(10, 7, new int[]{9, 9, 3, 1, 7, 9, 5, 6, 5, 4
        }));
    }

    public static int solve(int N, int a, int[] x) {
        // code here
        int dist[] = new int[N];
        Arrays.sort(x);
        for (int i = 0; i < x.length; i++) {
            dist[i] = x[i] - a;
            if (x[i] - a < 0) {
                dist[i] = -dist[i];
            }
        }
        Arrays.sort(dist);
        return dist[dist.length - 1] + dist[dist.length - 2];
    }
}
