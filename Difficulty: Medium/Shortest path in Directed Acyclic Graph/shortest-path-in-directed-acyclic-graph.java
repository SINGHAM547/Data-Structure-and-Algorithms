class Solution {
    static class Pair {
        int v;
        int wt;

        Pair(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }
    }
    void dfs(int u, ArrayList<ArrayList<Pair>> adj,
        boolean[] visited, Stack<Integer> st) {

        visited[u] = true;
        for (Pair p : adj.get(u)) {
            if (!visited[p.v]) {
                dfs(p.v, adj, visited, st);
            }
        }
        st.push(u);
    }
    public int[] shortestPath(int V, int E, int[][] edges) {

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(new Pair(edge[1], edge[2]));
        }
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, st);
            }
        }
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        while (!st.isEmpty()) {
            int u = st.pop();
            if (dist[u] != Integer.MAX_VALUE) {

                for (Pair p : adj.get(u)) {

                    if (dist[p.v] > dist[u] + p.wt) {
                        dist[p.v] = dist[u] + p.wt;
                    }
                }
            }
        }
        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                dist[i] = -1;
            }
        }
        return dist;
    }
}