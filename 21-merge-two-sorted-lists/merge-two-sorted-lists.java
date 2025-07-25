class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null) return list2;
        if(list2==null) return list1;
        ListNode newnode = new ListNode(0);
        ListNode temp = newnode;
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp=temp.next;
        }
        temp.next = list1==null?list2:list1;
        return newnode.next;
    }
}