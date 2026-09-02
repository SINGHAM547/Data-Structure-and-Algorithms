class Solution {
    public int solve(int n, String s) {
        int[] status = new int[26];
        int occupied = 0;
        int rejected = 0;

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'A';

            if (status[c] == 0) {
                if (occupied < n) {
                    status[c] = 1;
                    occupied++;
                } else {
                    status[c] = 2;
                    rejected++;
                }
            } else if (status[c] == 1) {
                occupied--;
            }
        }

        return rejected;
    }
}