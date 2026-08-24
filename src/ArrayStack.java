public class ArrayStack<T> {
    private Object[] array;
    private int top;


    public ArrayStack(int capacity) {
        this.array = new Object[capacity];
        this.top = -1;

    }

    public void push(T x) {
        if (top + 1 == array.length) {
            return;
        }
        array[top + 1] = x;
        top++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T value = (T) array[top];
        top--;
        return value;

    }

    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) array[top];

    }

    public boolean isEmpty() {

        return top == -1;
    }


}
