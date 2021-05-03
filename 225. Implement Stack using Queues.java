class MyStack {
    //用 queues 去實現 stack
    
    //創建一個 queue
    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
            queue = new LinkedList<>();
    }
    
    //關鍵操作
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x); //加入 x 到 queue 裡面
        //遍歷至最後一個數前的數
        for (int i = 0; i < queue.size()-1; i++) {
            queue.add(queue.poll());
        }
    }
    //queue.poll() 移除第一個 element 並 return 第一個 element
    //queue.add(queue.poll()) 把移除的第一個 element
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
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
