class Solution {
    public int spanningTree(int V, int[][] edges) {
        int [][] graph= new int[V][V];
        
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];
            
            graph[u][v]=wt;
            graph[v][u]=wt;
        }
        int[] key= new int[V];
        Arrays.fill(key,Integer.MAX_VALUE);
        boolean[] mstSet= new boolean[V];
        key[0]=0;
        int res=0;
        
        for(int count=0;count<V;count++){
            int u=-1;
            for(int i=0;i<V;i++){
                if(!mstSet[i] && (u==-1 || key[i]<key[u])){
                    u=i;
                }
            }
            mstSet[u]=true;
            res+= key[u];
            
            for(int v=0;v<V;v++){
                if(!mstSet[v]&& graph[u][v]!=0 && graph[u][v]<key[v]){
                    key[v]=graph[u][v];
                }
            }
        }
        return res;
    }
}
