class MinStack {
    Stack<Integer> s,m;
    public MinStack() {
        s=new Stack<>();
        m=new Stack<>();
    }
    
    public void push(int val) {
        if(m.isEmpty()||m.peek()>=val){
            m.push(val);
        }
        s.push(val);
    }
    
    public void pop() {
        if(m.peek().equals(s.peek())){
            m.pop();
        }
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return m.peek();
    }
}
