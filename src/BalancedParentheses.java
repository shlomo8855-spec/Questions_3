public class BalancedParentheses {

    public static boolean isValid(String s) {
        ArrayStack<Character> StringIsValid = new ArrayStack<>(s.length());


        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                StringIsValid.push(s.charAt(i));

            } else {
                if (StringIsValid.isEmpty()) {
                    return false;
                }


                if ((s.charAt(i) == ')' && StringIsValid.top() == '(') ||
                        (s.charAt(i) == '}' && StringIsValid.top() == '{') ||
                        (s.charAt(i) == ']' && StringIsValid.top() == '[')) {
                    StringIsValid.pop();
                } else {
                    return false;
                }
            }
        }
        return StringIsValid.isEmpty();
    }
}
