class Solution {
    public void solveSudoku(int[][] mat) {
        solve(mat);
    }
    boolean solve (int[][] mat){
        int row=-1,col=-1;
        boolean empty=false;
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(mat[i][j]==0){
                    row=i;
                    col=j;
                    empty=true;
                    break;
                }
            }
            if(empty) break;
        }
        if(!empty) return true;
        for(int num=1;num<=9;num++){
            if(isSafe(mat,row,col,num)){
                mat[row][col]=num;
                if(solve(mat)) return true;
                mat[row][col]=0;
            }
        }
        return false;
    }
    boolean isSafe(int[][] mat,int row,int col,int num){
        for(int j=0;j<9;j++){
            if(mat[row][j]==num){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(mat[i][col]==num)return false;
        }
        
        int rs = row-row%3;
        int cs = col-col%3;
        for(int i=rs;i<rs+3;i++){
            for(int j=cs;j<cs+3;j++){
                if(mat[i][j]==num) return false;
            }
        }
        return true;
    }
}