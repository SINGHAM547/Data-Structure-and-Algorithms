class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {

        int r = mat.length;
        int c = mat[0].length;

        ArrayList<Integer> ans = new ArrayList<>();

        // Single row
        if (r == 1) {

            for (int i = 0; i < c; i++) {
                ans.add(mat[0][i]);
            }
        }

        // Single column
        else if (c == 1) {

            for (int i = 0; i < r; i++) {
                ans.add(mat[i][0]);
            }
        }

        else {

            // Top row
            for (int i = 0; i < c; i++) {
                ans.add(mat[0][i]);
            }

            // Right column
            for (int i = 1; i < r; i++) {
                ans.add(mat[i][c - 1]);
            }

            // Bottom row
            for (int i = c - 2; i >= 0; i--) {
                ans.add(mat[r - 1][i]);
            }

            // Left column
            for (int i = r - 2; i >= 1; i--) {
                ans.add(mat[i][0]);
            }
        }

        return ans;
    }
}