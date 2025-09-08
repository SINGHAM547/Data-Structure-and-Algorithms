/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split the list into two halves.
        ListNode mid = getMid(head);
        ListNode rightHalf = mid.next;
        mid.next = null; // Split the list
        ListNode leftHalf = head;

        // Step 2: Recursively sort each half.
        ListNode sortedLeft = sortList(leftHalf);
        ListNode sortedRight = sortList(rightHalf);

        // Step 3: Merge the two sorted halves.
        return merge(sortedLeft, sortedRight);
    }

    /**
     * Finds the middle node of the list to split it into two halves.
     * For a list with an even number of nodes, this returns the first of the two middle nodes.
     */
    private ListNode getMid(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * Merges two sorted linked lists into one sorted list.
     */
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Append the remaining nodes from either list.
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummyHead.next;
    }
}