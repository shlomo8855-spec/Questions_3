//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        QueueBasedStack<Integer> stack = new QueueBasedStack<>(5);
//        FixedSizeArrayQueue<Integer> queue = new FixedSizeArrayQueue<>(5);
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//
//
//        queue.print();
//
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//
//        queue.print();
//
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


//        ArrayStack<Integer> stack = new ArrayStack<>(5);
//
//        stack.push(3);
//        stack.push(1);
//        stack.push(4);
//        stack.push(2);
//
//        SortStack.sortStack(stack);
//
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
//

        MinStack stack = new MinStack(5);
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);


        System.out.println(stack.getMin());

    }
}