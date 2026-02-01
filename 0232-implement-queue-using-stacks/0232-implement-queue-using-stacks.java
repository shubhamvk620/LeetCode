class MyQueue {
        Stack<Integer> s1,s2; // taken 2 stack
    public MyQueue() {
        s1 = new Stack<>(); // created new stack1
        s2 = new Stack<>(); // temprory, created new stack2.
    }
    
    public void push(int x) { // first pushing values in stack 1
      s1.push(x);
    }
    
    public int pop() { 
          while(!s1.isEmpty()){ // stack1 se stack 2 me push kea
            s2.push(s1.pop());
        }
        int ans = s2.pop(); // in stack 2 peek value wahi queue ki hisab se pop hoga islea usko ans me saved

        while(!s2.isEmpty()){ // after saving return remaining val in stack 1 again.
            s1.push(s2.pop());
        }
        return ans;
    }
    
    public int peek() { // queue ka peek val return krna hai
         while(!s1.isEmpty()){ // temp stack2 me stack1 ka val daale toh reverse ho k vhala gaya
            s2.push(s1.pop());
        }
        int ans = s2.peek(); // stack2 me top val hi peek val hai. Saved in ans

        while(!s2.isEmpty()){ // again pushed in stack1 from dtack 2.
            s1.push(s2.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        return s1.isEmpty();
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