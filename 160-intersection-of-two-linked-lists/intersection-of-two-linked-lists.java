/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength1(headB);
        while(lenA>lenB){
            lenA--;
            headA = headA.next;
        }
        while(lenB>lenA){
            lenB--;
            headB = headB.next;
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    private int getListLength(ListNode headA){
        int count = 0;
        while(headA != null){
            count++;
            headA = headA.next;
        }
        return count;
    }
    private int getListLength1(ListNode headB){
        int count = 0;
        while(headB != null){
            count++;
            headB = headB.next;
        }
        return count;
    }
}