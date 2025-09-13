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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null|| k==0){
            return head;
        }
        ListNode tail = head;
        int length = 1;
        while(tail.next != null){
            tail = tail.next;
            length+=1;
        }
        tail.next = head;
        k = k % length;
        int newti = length-k;
        ListNode   newTail = head;
        for(int i=1;i<newti;i++){
            newTail = newTail.next;
        }
        ListNode newhead = newTail.next;
        newTail.next = null;
        return newhead;
    }
}