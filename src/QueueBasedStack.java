public class QueueBasedStack<T> {
    private FixedSizeArrayQueue<T> queue1;
    private FixedSizeArrayQueue<T> queue2;


    public QueueBasedStack(int capacity) {
        this.queue1 = new FixedSizeArrayQueue<>(capacity);
        this.queue2 = new FixedSizeArrayQueue<>(capacity);


    }

    public void push(T x) {
        queue2.enqueue(x);
        while (queue1.size() > 0) {
            queue2.enqueue(queue1.dequeue());
        }
        FixedSizeArrayQueue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

    }


}
