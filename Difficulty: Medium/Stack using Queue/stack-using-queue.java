class myStack {
    Queue<Integer> q = new LinkedList<>();
    int size=0;
    void push(int x) {
        q.add(x);
        size=q.size();
        for(int i=1;i<size;i++){
            q.add(q.remove());
        }
    }

    void pop() {
        if(!q.isEmpty()) {
            q.remove();
        }
    }

    int top() {
      if(q.isEmpty()){
          return -1;
      }
       return q.peek();
    }

    int size() {
       return q.size();
    }
}
