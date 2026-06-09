/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtBeginning(Node tail, int key) {
        Node temp = new Node(key);
        if(tail==null) return null;
        
            temp.next=tail.next;
            tail.next=temp;
        
        return tail;
    }
}