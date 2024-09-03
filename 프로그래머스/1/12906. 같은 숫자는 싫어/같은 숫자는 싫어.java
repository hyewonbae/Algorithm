import java.util.*;

/**
 * 배열 arr의 각 원소는 0~9까지로 구성
 * 연속적으로 나타나는 숫자는 하나만 남기고 제거
 * */
public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            // 스택이 비어있거나 i가 직전에 담긴 값과 다를 경우 스택에 i 넣기
            if (stack.isEmpty() || stack.peek() != i ) {
                stack.push(i);
            }
        }
        // 스택을 정수의 배열로 반환
        return stack.stream().mapToInt(i -> i).toArray();
    }
}