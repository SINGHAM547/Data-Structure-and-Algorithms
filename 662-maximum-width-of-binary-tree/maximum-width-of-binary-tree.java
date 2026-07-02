import java.util.*;

class Solution {

    class Pair {
        TreeNode node;
        long index;

        Pair(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        int ans = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            long minIndex = q.peek().index; // Normalize indices
            long first = 0, last = 0;

            for (int i = 0; i < size; i++) {

                Pair curr = q.poll();

                long index = curr.index - minIndex;

                if (i == 0)
                    first = index;

                if (i == size - 1)
                    last = index;

                if (curr.node.left != null)
                    q.offer(new Pair(curr.node.left, 2 * index + 1));

                if (curr.node.right != null)
                    q.offer(new Pair(curr.node.right, 2 * index + 2));
            }

            ans = Math.max(ans, (int) (last - first + 1));
        }

        return ans;
    }
}