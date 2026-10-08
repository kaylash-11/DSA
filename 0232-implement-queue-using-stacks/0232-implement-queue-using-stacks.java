class MyQueue {
   Stack<Integer> st=new Stack<>();
   Stack<Integer> helper=new Stack();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        int val=0;
       while(st.size()>1)
       {
         helper.push(st.pop());
       }
       if(st.size()==1) 
       {
         val=st.pop();
       }
       while(helper.size()>0)
       {
        st.push(helper.pop());
       }
       return val;
    }
    
    public int peek() {
        int val=0;
        while(st.size()>0)
        {
            if(st.size()==1)
            {
              val=st.peek();
            }
            helper.push(st.pop());
        }
      while(helper.size()>0)
      {
        st.push(helper.pop());
      }
      return val;
    }
    
    public boolean empty() {
        if(st.size()==0) return true;
        else return false;
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