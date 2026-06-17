/* A binary tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(root);
        while(q.isEmpty()==false){
            Node curr=q.poll();
            ans.add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        return ans;
    }
}