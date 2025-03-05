import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
       Arrays.fill(answer,-1);
        Stack<Integer> stack = new Stack<>(); // 인덱스를 저장하는 스택

        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i); 
        }

        return answer;
    }
}