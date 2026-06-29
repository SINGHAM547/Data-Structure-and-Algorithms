class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                ans.add(mat[i][j]);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}