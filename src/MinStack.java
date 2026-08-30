public class MinStack {
    ArrayStack<Integer> stack;
    ArrayStack<Integer> minStack;


    public MinStack(int capacity) {
        this.stack = new ArrayStack<>(capacity);
        this.minStack = new ArrayStack<>(capacity);
    }


    public void push(Integer value) {
        if (stack.isEmpty()) {
            minStack.push(value);
            stack.push(value);

        } else if (minStack.top() <= value) {
            minStack.push(minStack.top());
            stack.push(value);

        } else {
            minStack.push(value);
            stack.push(value);
        }
    }

    public Integer pop(){
        minStack.pop();
        return stack.pop();
    }

    public Integer getMin(){
        return minStack.top();
    }


}
