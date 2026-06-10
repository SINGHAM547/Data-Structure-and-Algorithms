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
    Node reverseList(Node head) {
        if(head==null || head.next==null) return head;
        Node resthead=reverseList(head.next);
        Node resttail = head.next;
        resttail.next=head;
        head.next=null;
        return resthead;
    }
}