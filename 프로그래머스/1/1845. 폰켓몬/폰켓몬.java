import java.io.*;
import java.util.*;

class Solution {
    static int answer;
    public int solution(int[] nums) {
      	
		// HashSet : 순서X, 중복 허용X
        Set<Integer> set = new HashSet<>();
        
        // 최대 선택할 수 있는 수
		int pick_num = nums.length / 2;	
		
		//중복된 폰켓몬은 저장X
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);	
		}

		answer=0;
		
		// 선택 가능한 최대 폰켓몬 수와 실제 폰켓몬 종류의 수 비교
		// 실제 폰켓몬 종류의 수가 더 작거나 같으면 그만큼 선택
		if (pick_num >= set.size()) {
			answer = set.size();
		} else {
			answer = pick_num;
		}

		return answer;
    }
}