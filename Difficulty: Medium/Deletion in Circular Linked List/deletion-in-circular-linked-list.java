class Solution {
    public Node deleteNode(Node head, int key) {
        if (head == null)
            return null;
        if (head.data == key) {
            if (head.next == head)
                return null;
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            return head.next;
        }
        Node current = head;
        while (current.next != head &&
               current.next.data != key) {
            current = current.next;
        }
        if (current.next.data == key) {
            current.next = current.next.next;
        }
        return head;
    }
}