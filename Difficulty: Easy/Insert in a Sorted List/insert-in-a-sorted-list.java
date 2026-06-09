/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        Node t = new Node(key);
        if (head == null) {
            return t;
        }
        if (head.data >= key) {
            t.next = head;
            return t;
        }
        Node current = head;
        while (current.next != null && current.next.data < key) {
            current = current.next;
        }
        t.next = current.next;
        current.next = t;
        return head;
    }
}