/* Structure of linked list Node
class Node
{
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    int getKthFromLast(Node head, int k) {
        Node fast=head;
        if(head==null) return -1;
        int i;
        for(i=1;i<=k && fast!=null;i++){
            fast= fast.next;
        }
        if(i<=k){
                return -1;
            }
        
        Node slow= head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}