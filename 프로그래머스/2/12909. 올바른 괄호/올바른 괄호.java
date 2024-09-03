
/**
 * '(' 문자로 열렸으면, ')' 문자로 닫혀야 한다.
 * return 문자열 s 가 올바른 괄호이면 true, 아니면 false
 * */
import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else if(stack.peek() == '('){
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}