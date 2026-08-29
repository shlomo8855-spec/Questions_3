public class SortStack {
    ArrayStack<Integer> stack = new ArrayStack<>(5);


    public static void sortStack(ArrayStack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int value = stack.pop();
        sortStack(stack);
        insertSorted(stack, value);

    }

    public static void insertSorted(ArrayStack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        if (stack.top() <= value) {
            stack.push(value);
        } else {
            int temp = stack.pop();
            insertSorted(stack, value);
            stack.push(temp);

        }


    }


}
