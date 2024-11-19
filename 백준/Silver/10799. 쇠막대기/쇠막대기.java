/**
 * ()(((()())(())()))(())
 * 
 * 17
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        Stack<Character> stack = new Stack<>();

        int res = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
                continue;
            }
            if (input.charAt(i) == ')') {
                stack.pop();
                if(input.charAt(i-1)=='('){
                    res += stack.size();
                } else {
                    res++;
                }
            }
        }

        bw.write(res+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
