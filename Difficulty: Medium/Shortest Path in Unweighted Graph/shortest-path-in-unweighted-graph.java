class Solution {
    public int shortestPath(int V, int[][] edges, int src, int dest) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int [] dist =new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        boolean[] visited=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        dist[src]=0;
        visited[src]=true;
        q.offer(src);
        
        while(!q.isEmpty()){
            int u=q.poll();
            for(int v:adj.get(u)){
                if(!visited[v]){
                    visited[v]=true;
                    dist[v]=dist[u]+1;
                    q.offer(v);
                }
            }
        }
        return dist[dest]==Integer.MAX_VALUE?-1:dist[dest];
    }
}