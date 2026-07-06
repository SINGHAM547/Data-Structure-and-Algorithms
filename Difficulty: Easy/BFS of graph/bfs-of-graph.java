class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans= new ArrayList<>();
        int V=adj.size();
        boolean[] visited =new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        visited[0]=true;
        q.offer(0);
        
        while(!q.isEmpty()){
            int u=q.poll();
            ans.add(u);
            
            for(int v:adj.get(u)){
                if(!visited[v]){
                    visited[v]=true;
                    q.offer(v);
                }
            }
        }
        return ans;
    }
}