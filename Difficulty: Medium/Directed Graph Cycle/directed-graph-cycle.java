class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int [] indegree= new int[V];
        
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            indegree[v]++;
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int u=q.poll();
            count++;
            for(int v:adj.get(u)){
                indegree[v]--;
                if(indegree[v]==0){
                    q.offer(v);
                }
            }
        }
        return count!=V;
    }
}