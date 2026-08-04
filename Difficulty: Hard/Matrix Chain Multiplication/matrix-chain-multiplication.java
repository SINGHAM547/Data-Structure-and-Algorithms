class Solution {
    
    static int[][] dp;
    static int solver(int[] arr, int i, int j) {

        if (i >= j)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];

        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int tempAns = solver(arr,i,k)+solver(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
            min = Math.min(min, tempAns);
        }
        return dp[i][j] = min;
    }
    static int matrixMultiplication(int[] arr) {
        int n = arr.length;
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solver(arr, 1, n - 1);
    }
}