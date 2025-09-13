// User function Template for Java

class Solution {
    Node removeDuplicates(Node head) {
        if(head==null && head.next==null) return head;
        Node current = head;
        while(current.next!=null){
            if(current.data==current.next.data){
                Node nextnext = current.next.next;
                current.next = nextnext;
                
                if(nextnext!=null){
                    nextnext.prev = current;
                }
            }else{
                current = current.next;
            }
        }
        return head;
    }
}