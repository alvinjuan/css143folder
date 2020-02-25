package hw2.problem2;
// got a lot of help from geeksforgeeks.org
// got help from youtuber nick white

public class ValidParentheses {
    public static boolean isValid(String str) {
        // homework
        if (str.length() == 0) { return true; }
        if (str.length() % 2 != 0) { return false; }
        ArrayStack stack = new ArrayStack(str.length());
        for (char a : str.toCharArray()) {
            if (a == '(' || a == '{' || a == '[') {
                stack.push(a);
            }
            else {
                if (a == ')' && stack.peek().getData() == '('){
                    stack.pop();
                }
                else if (a == '}' && stack.peek().getData() == '{'){
                    stack.pop();
                }
                else if (a == ']' && stack.peek().getData() == '['){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        if (stack.size() != 0){
            return false;
        }
        return true;
    }
    public static boolean testIsValid () {
        String[] inputs = {
                "(}",
                "{}()",
                ")[]("};
        boolean[] expected = {false, true, false};

        for (int i = 0; i < inputs.length; i++) {
            boolean actual = isValid(inputs[i]);
            if (actual != expected[i]) {
                System.out.println("Failed, Expected: " + expected[i] + " Actual: " + actual);
                return false;
            }
        }
        return true;
    }
}


