class Solution {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        
        int board[][] = new int[n][n];
        solve(0,n,board);
        return ans;
    }
    void solve (int col,int n,int[][] board){
        if(col==n){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<n;j++){
                for(int i=0;i<n;i++){
                    if(board[i][j]==1){
                        temp.add(i+1);
                    }
                }
            }
            ans.add(temp);
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(row,col,board,n)){
                board[row][col]=1;
                solve(col+1,n,board);
                board[row][col]=0;
            }
        }
    }
    boolean isSafe(int row,int col,int[][]board, int n){
        for(int j=0;j<col;j++){
            if(board[row][j]==1) return false;
        }
        for(int i=row,j=col;i>=0&& j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row,
        j=col;i<n && j>=0;i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }
}