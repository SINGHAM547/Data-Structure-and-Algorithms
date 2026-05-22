class Solution {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        int r = matrix.length;
        int c = matrix[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    ans.add(matrix[i][j]);
                }
            } else {
                for (int j = c - 1; j >= 0; j--) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}