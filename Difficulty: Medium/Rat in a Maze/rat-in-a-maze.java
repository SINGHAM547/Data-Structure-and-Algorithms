class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> res= new ArrayList<>();
        backtrack(0,0,maze, new StringBuilder(""),res);
        return res;
    }
    void backtrack( int r,int c,int[][] maze, StringBuilder cur, ArrayList<String> res){
        int n = maze.length;
        if(r>=n|| c>=n|| r<0|| c<0){
            return;
        }
        if(maze[r][c]==2){
            return;
        }
        if(maze[r][c]==0){
            return;
        }
        if(r==n-1&& c==n-1){
            res.add(cur.toString());
            return;
        }
        maze[r][c]=2;
        cur.append("D");
        backtrack(r+1,c,maze,cur,res);
        cur.deleteCharAt(cur.length()-1);
        cur.append("L");
        backtrack(r,c-1,maze,cur,res);
        cur.deleteCharAt(cur.length()-1);
        cur.append("R");
        backtrack(r,c+1,maze,cur,res);
        cur.deleteCharAt(cur.length()-1);
        cur.append("U");
        backtrack(r-1,c,maze,cur,res);
        cur.deleteCharAt(cur.length()-1);
    
        maze[r][c]=1;
    }
}  