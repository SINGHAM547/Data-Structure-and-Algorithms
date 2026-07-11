class Solution {
    int timer;
    void dfs(int u, int parent,
             ArrayList<ArrayList<Integer>> adj,
             boolean[] vis,
             int[] disc,
             int[] low,
             int c, int d,
             boolean[] ans) {
        vis[u] = true;
        disc[u] = low[u] = ++timer;
        for (int v : adj.get(u)) {
            if (v == parent)
                continue;
            if (!vis[v]) {
               dfs(v, u, adj, vis, disc, low, c, d, ans);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] > disc[u]) {
                    if ((u == c && v == d) || (u == d && v == c))
                        ans[0] = true;
                }
            } else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
    public boolean isBridge(int V, int[][] edges, int c, int d) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] vis = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        boolean[] ans = new boolean[1];
        timer = 0;

        for (int i = 0; i < V; i++) {
            if (!vis[i])
                dfs(i, -1, adj, vis, disc, low, c, d, ans);
        }
        return ans[0];
    }
}