/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        DLLNode curr = head;
        while(curr!=null){
            DLLNode temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            
            if(curr.prev==null)
            head=curr;
            curr=curr.prev;
        }
        return head;
    }
}