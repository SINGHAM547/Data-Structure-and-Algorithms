/* Structure of a Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    boolean isFoldable(Node root) {
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
    
    boolean isMirror(Node left, Node right){
        
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        
        return isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }
}