class Solution {
    public void helper(int u,ArrayList<ArrayList<Integer>> adj, boolean[] visited,ArrayList<Integer> ans){
        
        visited[u]=true;
        ans.add(u);
        
        for(int v:adj.get(u)){
            if(!visited[v]){
                helper(v,adj,visited,ans);
            }
        }
    }
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] visited= new boolean[adj.size()];
        
        helper(0,adj,visited,ans);
        return ans;
    }
}