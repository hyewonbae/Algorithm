/**
 * 6
 * (())())
 * (((()())()
 * (()())((()))
 * ((()()(()))(((())))()
 * ()()()()(()()())()
 * (()((())()(
 *
 * NO
 * NO
 * YES
 * NO
 * YES
 * NO
 * */

import java.io.*;
import java.util.*;
public class Main {
    static StringBuilder sb = new StringBuilder();
    static void checkVPS(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ')' && !stack.isEmpty()) {
                if(stack.peek() == '('){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
        if(stack.isEmpty()){
            sb.append("YES").append("\n");
        } else{
            sb.append("NO").append("\n");
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            checkVPS(str);
        }
        System.out.println(sb);
        br.close();
    }
}
