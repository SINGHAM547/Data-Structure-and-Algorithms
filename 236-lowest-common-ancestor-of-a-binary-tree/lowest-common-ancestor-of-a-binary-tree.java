/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p || root==q) return root;
        TreeNode lc1= lowestCommonAncestor(root.left,p,q);
        TreeNode lc2=lowestCommonAncestor(root.right,p,q);
        if(lc1 !=null && lc2 !=null) return root;
        if(lc1!=null) return lc1;
        else return lc2;
    }
}