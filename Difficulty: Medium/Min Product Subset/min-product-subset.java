class Solution {
    public int minProd(int[] arr) {
        return solve(arr, 0, 1, false);
    }
    private int solve(int[] arr, int i, int product, boolean taken) {
        if (i == arr.length) {
            return taken ? product : Integer.MAX_VALUE;
        }
        int take = solve(arr, i + 1, product * arr[i], true);
        int skip = solve(arr, i + 1, product, taken);
        return Math.min(take, skip);
    }
}
    