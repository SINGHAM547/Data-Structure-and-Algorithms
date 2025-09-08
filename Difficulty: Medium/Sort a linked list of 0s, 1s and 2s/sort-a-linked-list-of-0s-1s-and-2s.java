/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node zerohead = new Node(-1);
        Node zerotail = zerohead;
        Node onehead = new Node(-1);
        Node onetail = onehead;
        Node twohead = new Node(-1);
        Node twotail = twohead;
        Node temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                zerotail.next = temp;
                zerotail = zerotail.next;
            } else if (temp.data == 1) {
                onetail.next = temp;
                onetail = onetail.next;
            } else {
                twotail.next = temp;
                twotail = twotail.next;
            }
            temp = temp.next;
        }
        if (onehead.next != null) {
            zerotail.next = onehead.next;
            onetail.next = twohead.next;
        } else {
            
            zerotail.next = twohead.next;
        }
        twotail.next = null;
        return zerohead.next;
    }
}