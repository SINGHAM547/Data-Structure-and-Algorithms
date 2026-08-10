class Solution {

    static int diameter(Node root) {

        int[] res = new int[1];

        solve(root, res);

        return res[0];
    }

    static int solve(Node root, int[] res) {

        if (root == null)
            return 0;

        int l = solve(root.left, res);
        int r = solve(root.right, res);

        int temp = Math.max(l, r) + 1;

        int ans = l + r ;

        res[0] = Math.max(res[0], ans);

        return temp;
    }
}