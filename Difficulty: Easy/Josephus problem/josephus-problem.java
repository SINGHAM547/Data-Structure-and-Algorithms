class Solution {

    public int josephus(int n, int k) {
        return helper(n, k) + 1; // +1 for 1-based indexing
    }

    int helper(int n, int k) {

        // Base case
        if (n == 1) {
            return 0;
        }

        // Recursive relation
        return (helper(n - 1, k) + k) % n;
    }
}