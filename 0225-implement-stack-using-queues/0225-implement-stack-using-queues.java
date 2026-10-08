class MyStack {
   Queue<Integer> q=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int val=0;
        int s=q.size();
        for(int i=1;i<=s;i++)
        {
            if(i==s) 
            {
                val=q.peek();
                q.remove();
            }
            else{
                q.add(q.remove());
            }
        }
        return val;
    }
    
    public int top() {
        int val=0;
        int s=q.size();
        for(int i=1;i<=s;i++)
        {
            if(i==s) 
            {
                val=q.peek();
            }
       q.add(q.remove());
        }
        return val;
    }
    
    public boolean empty() {
        return (q.size()==0);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */