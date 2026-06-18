/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    int maxLevel = 0;

    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root, 1, ans);
        return ans;
    }

    void solve(Node root, int level, ArrayList<Integer> ans) {
        if (root == null)
            return;

        if (level > maxLevel) {
            ans.add(root.data);
            maxLevel = level;
        }

        solve(root.left, level + 1, ans);
        solve(root.right, level + 1, ans);
    }
}