/*
Definition for Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data  =d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> ans  = new ArrayList<>();
        
        if(root==null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int size = q.size();
            Integer[] level = new Integer[size];
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                int index;
                if(leftToRight) index=i;
                else index = size-1-i;
                level[index] = curr.data;
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            for(int x:level){
                ans.add(x);
            }
            leftToRight = !leftToRight;
        }
        return ans;
    }
}