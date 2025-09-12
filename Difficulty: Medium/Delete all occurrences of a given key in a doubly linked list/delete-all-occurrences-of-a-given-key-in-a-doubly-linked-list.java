// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node current = head;
        while(current!=null){
            if(current.data==x){
                Node toDelete = current;
                current  = current.next;
                if(toDelete == head){
                    head = toDelete.next;
                    if(head !=null){
                        head.prev  = null;
                    }
                }
                else{
                    toDelete.prev.next = toDelete.next;
                    if(toDelete.next !=null){
                        toDelete.next.prev = toDelete.prev;
                    }
                }
                toDelete.next = toDelete.prev = null;
            }else{
                current = current.next;
            }
        }
        return head;
    }
}