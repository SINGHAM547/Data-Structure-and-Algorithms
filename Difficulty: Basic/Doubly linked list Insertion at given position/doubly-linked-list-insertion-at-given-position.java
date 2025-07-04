/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        Node temp=head;
        int cnt=0;
        while(temp.next!=null){
            cnt++;
            if(cnt-1==p) break;
            temp = temp.next;
            
        }
        Node front = temp.next;
        Node newNode = new Node(x);
        if(front==null)
        {
            newNode.next=null;
            newNode.prev=temp;
            temp.next=newNode;
        }else{
            newNode.next=front;
            front.prev=newNode;
            newNode.prev = temp;
            temp.next =newNode;
        }
        return head;
        
    }
}