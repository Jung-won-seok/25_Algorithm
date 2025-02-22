package programmers;

import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        //"(())()" return = true

        Stack<Character> stack = new Stack<>();
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s1[i] == '(') {
                stack.push(s1[i]);
            } else if (s1[i] == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
