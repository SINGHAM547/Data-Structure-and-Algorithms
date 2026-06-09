/*// create class Node
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        //this.prev = null;
    }
}*/
class gfg {
    static Node insert_at_end(Node head, int x) {
        Node temp = new Node(x);
        if(head==null) return null;
        temp.next = head.next;
        head.next=temp;
        int d=head.data;
        head.data=temp.data;
        temp.data =d;
        return temp;
    }
}