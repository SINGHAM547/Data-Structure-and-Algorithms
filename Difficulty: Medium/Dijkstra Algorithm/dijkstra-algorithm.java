class Solution {
    static class Pair{
            int vertex;
            int dist;
            Pair(int vertex,int dist){
                this.vertex=vertex;
                this.dist=dist;
            }
        }
    public int[] dijkstra(int V, int[][] edges, int src) {
        ArrayList<ArrayList<Pair>> adj= new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];
            
            adj.get(u).add(new Pair(v,wt));
            adj.get(v).add(new Pair(u,wt));
        }
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->a.dist-b.dist);
        dist[src]=0;
        pq.offer(new Pair(src,0));
        
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int u=curr.vertex;
            for(Pair nbr:adj.get(u)){
                int v=nbr.vertex;
                int wt=nbr.dist;
                if(dist[u]+wt<dist[v]){
                    dist[v]=dist[u]+wt;
                    pq.offer(new Pair(v,dist[v]));
                }
            }
        }
        return dist;
    }
}