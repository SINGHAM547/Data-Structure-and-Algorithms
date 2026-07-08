class Solution {
    void dfs(int u, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> st){
        visited[u]=true;
        for(int v:adj.get(u)){
            if(!visited[v]){
                dfs(v,adj,visited,st);
            }
        }
        st.push(u);
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            adj.get(edge[0]).add(edge[1]);
        }
        boolean[] visited= new boolean[V];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,adj,visited, st);
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }
}