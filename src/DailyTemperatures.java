public class DailyTemperatures {


    static int[] answer(int[] temperatures) {
        int answer[] = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 1 + i; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    answer[i] = j - i;
                    break;
                }
            }
        }
        return answer;
    }


    static int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        ArrayStack stack = new ArrayStack<Integer>(temperatures.length);
        stack.push(0);

        for (int i = 1; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[(Integer) stack.top()]) {
                int index =
                answer[(Integer) stack.top()] = i - (Integer) stack.top();
                stack.pop();

            }
                stack.push((Integer) i);


        }
        return answer;
    }


}
