class Solution {

    static int palPartition(String s) {

        int n = s.length();

        boolean[][] pal = new boolean[n][n];

        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    pal[i][j] = true;
                } else if (g == 1) {
                    pal[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    pal[i][j] = (s.charAt(i) == s.charAt(j)) && pal[i + 1][j - 1];
                }
            }
        }

        int[] cuts = new int[n + 1];
        cuts[n] = -1;

        for (int i = n - 1; i >= 0; i--) {

            int min = Integer.MAX_VALUE;

            for (int j = i; j < n; j++) {

                if (pal[i][j]) {
                    min = Math.min(min, 1 + cuts[j + 1]);
                }
            }

            cuts[i] = min;
        }

        return cuts[0];
    }
}