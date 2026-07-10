class Solution {
    void dfs1(int u, ArrayList<ArrayList<Integer>> adj,boolean[] vis, Stack<Integer> st){
        vis[u]=true;
        for(int v:adj.get(u)){
            if(!vis[v]){
                dfs1(v,adj,vis,st);
            }
        }
        st.push(u);
    }
    void dfs2(int u,ArrayList<ArrayList<Integer>>rev, boolean[] vis){
        
        vis[u]=true;
        for(int v:rev.get(u)){
            if(!vis[v]){
                dfs2(v,rev,vis);
            }
        }
    }
    public int kosaraju(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        ArrayList<ArrayList<Integer>> rev= new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            rev.add(new ArrayList<>());
        }
        for(int [] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            rev.get(edge[1]).add(edge[0]);
        }
        boolean[] vis= new boolean[V];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs1(i,adj,vis,st);
            }
        }
        Arrays.fill(vis,false);
        int count=0;
        while(!st.isEmpty()){
            int node=st.pop();
            
            if(!vis[node]){
                dfs2(node,rev,vis);
                count++;
            }
        }
        return count;
    }
}