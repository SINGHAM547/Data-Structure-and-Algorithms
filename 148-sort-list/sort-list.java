/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
     if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Extract all values from the linked list into an ArrayList
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        // Step 2: Sort the ArrayList
        Collections.sort(values);

        // Step 3: Update the values of the original linked list
        current = head; // Reset current to the head
        for (int sortedVal : values) {
            current.val = sortedVal;
            current = current.next;
        }

        return head;
    }
}