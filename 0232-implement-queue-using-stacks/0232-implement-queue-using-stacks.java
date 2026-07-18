class MyQueue {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public MyQueue() {
        mainS = new Stack<>();
        helperS = new Stack<>();
        
    }
    
    public void push(int x) {
        while(!mainS.isEmpty()){
            helperS.push(mainS.pop());
        }

        mainS.push(x);

        while(!helperS.isEmpty()){
            mainS.push(helperS.pop());
        }
    }
    
    public int pop() {
        if(mainS.isEmpty()){
            return -1;
        }else{
           return mainS.pop();
        }
    }
    
    public int peek() {
        if(mainS.isEmpty()){
            return -1;
        }
        return mainS.peek();
        
    }
    
    public boolean empty() {
        if(mainS.isEmpty()){
            return true;
        }
        return false;
        
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