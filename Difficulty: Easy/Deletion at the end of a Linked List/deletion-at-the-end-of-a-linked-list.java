/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        Node current=head;
        if(head==null|| head.next==null) return null;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        return head;
    }
}