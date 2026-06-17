class Solution {
    int count = 0;

    int kthFromLeaf(Node root, int k) {
        ArrayList<Node> path = new ArrayList<>();
        HashSet<Node> set = new HashSet<>();
        solve(root, k, path, set);
        return count;
    }

    void solve(Node root, int k, ArrayList<Node> path, HashSet<Node> set) {
        if (root == null)
            return;

        path.add(root);

        if (root.left == null && root.right == null) {
            int idx = path.size() - k - 1;

            if (idx >= 0) {
                Node node = path.get(idx);

                if (!set.contains(node)) {
                    set.add(node);
                    count++;
                }
            }
        }

        solve(root.left, k, path, set);
        solve(root.right, k, path, set);

        path.remove(path.size() - 1);
    }
}