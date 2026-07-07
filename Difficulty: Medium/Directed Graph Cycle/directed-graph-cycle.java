class Solution {
    boolean dfs(int u,ArrayList<ArrayList<Integer>> adj,boolean[] visited, boolean[] recStack){
    
        visited[u]=true;
        recStack[u]=true;
        
        for(int v:adj.get(u)){
            if(!visited[v]){
                if(dfs(v,adj,visited,recStack))return true;
            }else if(recStack[v]){
                return true;
            }
        }
        recStack[u]=false;
        return false;
    }
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge:edges){
            adj.get(edge[0]).add(edge[1]);
        }
        boolean[] visited=new boolean[V];
        boolean[] recStack= new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,adj,visited,recStack)) return true;
            }
        }
        return false;
    }
}