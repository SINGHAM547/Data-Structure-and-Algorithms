/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int count=0;
        Node current =head;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
}