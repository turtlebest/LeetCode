class MinStack {
    
    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> mins = new Stack<Integer>();
    
    public void push(int x) {
        if (mins.isEmpty() || x <= mins.peek()) {
            mins.push(x);
        }
        s.push(x);
    }
    
    public void pop() {
        if (!s.isEmpty()) {
            int temp = s.pop();
            
            if (temp == mins.peek()) {
                mins.pop();
            }
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
