// Time Complexity : O(1) for push, pop and peek for average case. For worst case it is O(n) for pop and peek
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;
    
    public MyQueue() {
        in = new Stack<Integer>();
        out = new Stack<Integer>();
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.pop();
    }
    
    public int peek() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.peek();
    }
    
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
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
