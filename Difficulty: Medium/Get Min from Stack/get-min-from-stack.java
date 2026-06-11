import java.util.Stack;

class SpecialStack {

    Stack<Integer> s;
    Stack<Integer> min;
    public SpecialStack() {
        s = new Stack<>();
        min = new Stack<>();
    }
    public void push(int x) {
        s.push(x);
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        }
    }
    public void pop() {
        if (s.isEmpty()) {
            return;
        }
        int popVal = s.pop();
        if (popVal == min.peek()) {
            min.pop();
        }
    }
    public int peek() {
        if (s.isEmpty()) {
            return -1;
        }
        return s.peek();
    }
    public boolean isEmpty() {
        return s.isEmpty();
    }
    public int getMin() {
        if (min.isEmpty()) {
            return -1;
        }
        return min.peek();
    }
}