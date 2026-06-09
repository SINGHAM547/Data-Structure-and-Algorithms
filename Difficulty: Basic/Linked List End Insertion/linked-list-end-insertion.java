/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node temp = new Node(x);
        if(head==null) return temp;
        Node current =head;
        while(current.next!=null){
            current =current.next;
        }
        current.next=temp;
        temp.next=null;
        return head;
    }
}