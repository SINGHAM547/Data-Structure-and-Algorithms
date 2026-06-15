class Solution {
    public int median(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans.add(mat[i][j]);
            }
        }
        Collections.sort(ans);
        return ans.get((r*c)/2);
    }
}