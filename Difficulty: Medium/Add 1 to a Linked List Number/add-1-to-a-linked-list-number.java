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
     private int addHelper(Node node) {
        // Base Case: If we are at the end of the list, return 1 to start the carry
        if (node == null) {
            return 1;
        }
        
        // Recurse to the end of the list
        int carry = addHelper(node.next);
        
        // Add carry from the subsequent nodes to the current node's data
        int sum = node.data + carry;
        node.data = sum % 10;
        
        // Return the new carry to be used by the previous node
        return sum / 10;
    }

    // Main function to add one
    public Node addOne(Node head) {
        // Call the helper function to perform the addition
        int carry = addHelper(head);

        // If a carry remains after the entire list is processed (e.g., 999 + 1)
        // create a new head node for the carry.
        if (carry > 0) {
            Node newHead = new Node(carry);
            newHead.next = head;
            return newHead;
        }
        
        // Otherwise, return the original head
        return head;
    }
}