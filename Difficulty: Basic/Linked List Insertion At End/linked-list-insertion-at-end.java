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
        Node node = new Node(x);
        if(head==null){
            return node;
        }
        Node curr = head;
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next = node;
        return head;
    }
}