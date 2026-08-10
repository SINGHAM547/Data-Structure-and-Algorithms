/* Structure of binary tree node
class Node{
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}*/

class Solution {
    int findMaxSum(Node root) {
        int res[] = new int [1];
        res[0] = Integer.MIN_VALUE;
        solve(root,res);
        return res[0];
    }
    static int solve(Node root,int[] res){
        if(root==null) return 0;
        int l = solve(root.left,res);
        int r = solve(root.right,res);
        
        l = Math.max(0,l);
        r = Math.max(0,r);
        int temp = Math.max(l,r)+root.data;
        int ans = l+r+root.data;
        res[0]  = Math.max(res[0],ans);
        return temp;
    }
}