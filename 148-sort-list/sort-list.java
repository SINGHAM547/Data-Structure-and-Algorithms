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
        if(head==null || head.next==null) return head;
        ListNode mid = getMid(head);
        ListNode righthalf = mid.next;
        mid.next=null;
        ListNode lefthalf  = head;

        ListNode sortedleft = sortList(lefthalf);
        ListNode sortedright= sortList(righthalf);
        
        return merge(sortedleft,sortedright);


    }
    private ListNode getMid(ListNode head){
        if(head==null) return head;
        ListNode slow  = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode l1, ListNode l2){
        ListNode dummyhead = new ListNode (0);
        ListNode current = dummyhead;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next=l2;
                l2=l2.next;
            }
            current = current.next;
        }
            if(l1 !=null){
                current.next=l1;
            }else{
                current.next=l2;
            }
            
            return dummyhead.next;
        
    }
}