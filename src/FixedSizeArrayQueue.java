public class FixedSizeArrayQueue<T> {
    Object[] queue;
    int size = 0;
    int front = 0;
    int rear = 0;

    public FixedSizeArrayQueue(int capacity) {
        this.queue = new Object[capacity];
    }

    void enqueue(T x) {
        if (size == queue.length) {
            System.out.println("נסה מאוחר יותר הכל מלא");
            return;
        }

        queue[rear] = x;
        size++;
        rear = (rear + 1) % queue.length;
    }

    T dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }

        T value = (T) queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }

    T peek() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
//        T value = (T) queue[front];
        return (T) queue[front];
    }

    int size() {
        return size;
    }

    void reverse() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        for (int i = 0; i < size / 2; i++) {
            T temp = null;

            int left = (front + i) % queue.length;
            int right = (rear - 1 - i + queue.length) % queue.length;

            temp = (T) queue[left];
            queue[left] = queue[right];
            queue[right] = temp;
        }
    }

    public void print() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        for (int i = 0; i < size; i++) {
            int index = (front + i) % queue.length;

            System.out.println(queue[i]);

        }
    }

}
