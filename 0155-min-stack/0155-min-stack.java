class MinStack {
    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
        
    }
    
    public void push(int value) {
        stack.add(value);

        if(minStack.isEmpty()){
            minStack.add(value);

        }else{
            int currentelement = minStack.get(minStack.size() - 1);
            minStack.add(Math.min(currentelement , value));
        }
        
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        stack.remove(stack.size() - 1);
        minStack.remove(minStack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
        
    }
    
    public int getMin(){
        return minStack.get(minStack.size() - 1);
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */