/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;
    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node insertInTail(Node head, int data) {
        Node temp=new Node(data);
        Node current = head;
        if(head==null) return null;
        while(current.next!=null){
            current=current.next;
        }
        current.next=temp;
        temp.prev=current;
        temp.next=null;
        return head;
    }
}