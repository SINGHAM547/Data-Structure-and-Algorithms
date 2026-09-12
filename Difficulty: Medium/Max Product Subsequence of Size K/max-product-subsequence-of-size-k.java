class Solution {
    public long maxProduct(int[] arr, int k) {
        int n = arr.length;
        long[][] max = new long[n + 1][k + 1];
        long[][] min = new long[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                max[i][j] = Long.MIN_VALUE;
                min[i][j] = Long.MAX_VALUE;
            }
        }

        max[0][0] = 1;
        min[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            max[i][0] = 1;
            min[i][0] = 1;

            for (int j = 1; j <= Math.min(i, k); j++) {
                long x = arr[i - 1];

                if (max[i - 1][j] != Long.MIN_VALUE) {
                    max[i][j] = max[i - 1][j];
                    min[i][j] = min[i - 1][j];
                }

                if (max[i - 1][j - 1] != Long.MIN_VALUE) {
                    long a = max[i - 1][j - 1] * x;
                    long b = min[i - 1][j - 1] * x;

                    max[i][j] = Math.max(max[i][j], Math.max(a, b));
                    min[i][j] = Math.min(min[i][j], Math.min(a, b));
                }
            }
        }

        return max[n][k];
    }
}