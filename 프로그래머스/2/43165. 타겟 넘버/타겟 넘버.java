import java.io.*;
import java.util.*;


/**
depth		               0
4       	       4	        -4	
1       	  3       5       -5          -3
2         	1   5   3   7  -7    -3    -5    -1
1             0 2 4 6 2 4 6 8 -8 -6 -4 -2 -6 -4 -2 0    

*/
class Solution {
    static int count = 0;
    static void dfs(int[] numbers, int depth, int target, int answer) {
		// 종료조건
		// depth가 numbers.lenth와 일치 
		// answer 값이 target값인 경우 count증가
		if(depth == numbers.length) {
			if(answer == target) {
				count++;
			}
			return;
		}
		
		int plus = answer + numbers[depth];
		int minus = answer - numbers[depth];
		
		dfs(numbers, depth+1, target, plus);
		dfs(numbers, depth+1, target, minus);
		
	}
    
    public int solution(int[] numbers, int target) {
        count = 0;
        // 타겟넘버배열, 깊이, target 값, answer 값
    	dfs(numbers, 0, target, 0);
        
        return count;
    }
}
