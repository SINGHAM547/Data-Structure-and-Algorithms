/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans  = new ArrayList<>();
        postorder(root,ans);
        return ans;
}
        void postorder (Node root, ArrayList<Integer> ans){
            if(root==null){
                return;
            }else{
                postorder(root.left,ans);
                postorder(root.right,ans);
                ans.add(root.data);
            }
        }
}