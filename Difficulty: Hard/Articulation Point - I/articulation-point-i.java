class Solution {
    int timer=0;
    void dfs(int node,int parent,boolean[] visited,int[] tin,int[]low, boolean[]mark,ArrayList<ArrayList<Integer>> adj){
        visited[node]=true;
        tin[node]=low[node]=timer++;
        int children=0;
        
        for(int neigh:adj.get(node)){
            if(neigh==parent){
                continue;
            }
            if(!visited[neigh]){
                dfs(neigh,node,visited,tin,low,mark,adj);
                low[node]=Math.min(low[node],low[neigh]);
                
                if(parent!=-1 && low[neigh]>=tin[node]){
                    mark[node]=true;
                }
            
                children++;
            }else{
                low[node]=Math.min(low[node],tin[neigh]);
            }
    }
    if(parent==-1 &&children>1){
        mark[node]=true;
    }
}
    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj) {
        
        boolean[] visited= new boolean[V];
        int[] tin= new int[V];
        int[] low = new int[V];
        boolean[] mark= new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,-1,visited,tin,low,mark,adj);
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<V;i++){
            if(mark[i]){
                ans.add(i);
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }
        return ans;
    }
}