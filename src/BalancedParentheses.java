public class BalancedParentheses {

    public static boolean isValid(String s) {
        ArrayStack<Character> StringIsValid = new ArrayStack<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            if ()
            if ((s.charAt(i) == ')' && StringIsValid.top() == '(') ||
                    (s.charAt(i) == '}' && StringIsValid.top() == '{') ||
                    (s.charAt(i) == ']' && StringIsValid.top() == '[')) {
//                StringIsValid.top()
                char current = s.charAt(i);
            }
            StringIsValid.push(s.charAt(i));

        }


        return true;
    }
}
