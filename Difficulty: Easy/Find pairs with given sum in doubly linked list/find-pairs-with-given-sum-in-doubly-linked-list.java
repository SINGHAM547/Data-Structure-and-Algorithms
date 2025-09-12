/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        Node left = head;
        Node right = head;
        while(right.next !=null){
            right = right.next;
            
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while(left!=null && right!=null && left.data<right.data){
            if(left.data+right.data==target){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(left.data);
                list.add(right.data);
                ans.add(list);
                left = left.next;
                right = right.prev;
                
            }else if (left.data+right.data<target){
                left = left.next;
            }else{
                right = right.prev;
            }
        }
        return ans;
    }
}
