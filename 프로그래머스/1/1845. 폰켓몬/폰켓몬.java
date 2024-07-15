import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
		int pick_num = nums.length / 2;	
		
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);	
		}

		int answer=0;
        
		if (pick_num >= set.size()) {
			answer = set.size();
		} else {
			answer = pick_num;
		}

		return answer;
    }
}