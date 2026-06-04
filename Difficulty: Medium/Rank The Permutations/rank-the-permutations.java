class Solution {
    public long findRank(String s) {
        int n = s.length();

        long rank = 1;

        long[] fact = new long[n + 1];
        fact[0] = 1;

        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
        }

        for (int i = 0; i < n; i++) {

            int smaller = 0;

            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) < s.charAt(i)) {
                    smaller++;
                }
            }

            rank += smaller * fact[n - i - 1];
        }

        return rank;
    }
}