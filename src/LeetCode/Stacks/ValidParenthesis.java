package LeetCode.Stacks;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValidParenthesis("{()}}}}}"));
        System.out.println(isValidParenthesis("{()}"));
        System.out.println(isValidParenthesis("}}}((("));
    }

    public static boolean isValidParenthesis(String s) {
        /*
         * Time complexity:O(N)
         * Space complexity:O(N)*/
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    char peekElement = stack.peek();
                    if ((peekElement == '{' && c == '}') || (peekElement == '[' && c == ']') || (peekElement == '(' && c == ')')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else
            return false;
    }
}
