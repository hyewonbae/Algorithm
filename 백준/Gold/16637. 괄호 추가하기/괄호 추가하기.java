import java.io.*;
import java.util.*;

public class Main {
    static List<Integer> numList = new ArrayList<>();
    static List<Character> charList = new ArrayList<>();
    static int max = Integer.MIN_VALUE;
    public static void dfs(int index, int currentResult){
        // 종료조건 : 연산자를 다 쓴 경우
        if(index == charList.size()){
            max = Math.max(max, currentResult);
            return;
        }

        // 괄호없이 계산
        int result1 = calc(currentResult, charList.get(index), numList.get(index+1));
        dfs(index+1, result1);

        // 괄호씌워서 먼저 계산
        if( index + 1 < charList.size()){
            int bracket = calc(numList.get(index+1), charList.get(index+1), numList.get(index+2));
            int result2 = calc(currentResult, charList.get(index), bracket);
            dfs(index+2, result2);
        }
    }
    public static int calc(int a, char op, int b){
        if(op == '+') return a+b;
        else if(op == '-') return a-b;
        else return a*b;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if(i%2 == 0){
                numList.add(str.charAt(i)-'0');
            } else {
                charList.add(str.charAt(i));
            }
        }

        /**
         * [3, 8, 7, 9, 2]
         * [+, *, -, *]
         * */
        dfs(0,numList.get(0)); // 0,3
        System.out.println(max);
    }
}
