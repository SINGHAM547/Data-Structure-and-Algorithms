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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalfHead = reverse(slow.next);
        ListNode firstHalfHead = head;
        ListNode currentSecondHalf = secondHalfHead;

        boolean isPalindrome = true;
        while(currentSecondHalf != null){
            if(firstHalfHead.val != currentSecondHalf.val){
                isPalindrome = false;
                break;
            }
            firstHalfHead = firstHalfHead.next;
            currentSecondHalf = currentSecondHalf.next;
        }
        slow.next = reverse(secondHalfHead);
        return isPalindrome;
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while(current!= null){
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}