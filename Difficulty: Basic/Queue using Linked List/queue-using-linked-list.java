// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
class myQueue {
        private Node front ,rear;
        private int size;
    public myQueue() {
        front=rear=null;
        size=0;
        
    }

    public boolean isEmpty() {
        return front==null;
    }

    public void enqueue(int x) {
        Node temp=new Node(x);
        if(front==null){
            front =rear=temp;
        }else{
        rear.next=temp;
        rear=temp;
        }
        size++;
    }

    public void dequeue() {
        if(front==null) return;
        front=front.next;
        size--;
        if(front==null){
            rear=null;
        }
    }

    public int getFront() {
      return isEmpty()?-1:front.data;
    }

    public int size() {
        return size;
    }
}
