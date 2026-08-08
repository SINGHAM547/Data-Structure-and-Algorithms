class Solution {

    static int[][] dp;

    static int eggDrop(int n, int k) {

        dp = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(n, k);
    }

    static int solve(int n, int k) {

        // Base cases
        if (k == 0 || k == 1)
            return k;

        if (n == 1)
            return k;

        // Memoization
        if (dp[n][k] != -1)
            return dp[n][k];

        int min = Integer.MAX_VALUE;

        int low = 1;
        int high = k;

        // Binary search for optimal floor
        while (low <= high) {

            int mid = low + (high - low) / 2;

            int breakCase = solve(n - 1, mid - 1);
            int notBreakCase = solve(n, k - mid);

            int temp = 1 + Math.max(breakCase, notBreakCase);

            min = Math.min(min, temp);

            if (breakCase < notBreakCase) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return dp[n][k] = min;
    }
}