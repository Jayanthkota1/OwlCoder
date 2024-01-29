class MyQueue {
    Stack<Integer> s,s1;
    public MyQueue() {
       s=new Stack<Integer>();
       s1=new Stack<Integer>(); 
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        while(!s.empty())
        {
            s1.push(s.pop());
        }
        int k=s1.pop();
        while(!s1.empty())
        {
            s.push(s1.pop());
        }
        return k;
    }
    
    public int peek() {
        while(!s.empty())
        {
            s1.push(s.pop());
        }
        int k=s1.peek();
        while(!s1.empty())
        {
            s.push(s1.pop());
        }
        return k;
    }
    
    public boolean empty() {
        return s.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */