// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = this.prev = null;
    }
}
*/

// Complete the function
class Solution {
    public static Node deleteHead(Node head) {
        if(head==null||head.next==null)return head;
        head=head.next;
        head.prev=null;
        return head;
    }
}