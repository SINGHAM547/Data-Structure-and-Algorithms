class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                pq.offer(mat[i][j]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }
        return ans;
    }
}