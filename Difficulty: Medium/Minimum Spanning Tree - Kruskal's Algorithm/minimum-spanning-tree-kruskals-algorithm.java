class Solution {
    static int[] parent;
    static int[] rank;
    
    static int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    static void union(int x,int y){
        int px=find(x);
        int py=find(y);
        
        if(rank[px]<rank[py]){
            parent[px]=py;
        }else if(rank[px]> rank[py]){
            parent[py]=px;
        }else{
            parent[py]=px;
            rank[px]++;
        }
    }
    static int kruskalsMST(int V, int[][] edges) {
        Arrays.sort(edges,(a,b)-> a[2]-b[2]);
        parent=new int[V];
        rank=new int[V];
        
        for(int i=0;i<V;i++){
            parent[i]=i;
            rank[i]=0;
        }
        int res=0;
        for(int i=0,s=0;s<V-1 && i<edges.length;i++){
            int[]e =edges[i];
            int x= find(e[0]);
            int y = find(e[1]);
            
            if(x!=y){
                res+=e[2];
                union(x,y);
                s++;
            }
        }
        return res;
    }
}
