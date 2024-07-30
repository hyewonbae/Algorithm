import java.io.*;
import java.util.*;

class Solution {
    static boolean[] v;
	static int answer =0;
    
    
    /**
     * 깊이 우선 탐색(DFS)을 이용해 단어 변환 과정을 탐색하는 함수
     * @param begin 현재 단어
     * @param target 목표 단어
     * @param words 단어 목록
     * @param cnt 변환 횟수
     */
    
    static void dfs(String begin, String target, String[] words, int cnt) {
		
		if(begin.equals(target)) {
			answer = cnt;
			return;
		}
		
		for(int i=0;i<words.length;i++) {
			if(v[i]) {
				continue;
			}
			
			int same_spell = 0;
			
			for(int j=0;j<begin.length();j++) {
				if(begin.charAt(j)==words[i].charAt(j)) {
					same_spell++;
				}
			}
			
			if(same_spell == begin.length()-1) {
				v[i] = true;
				dfs(words[i], target, words, cnt+1);
				v[i] = false;
			}
		}
	}
    
    public int solution(String begin, String target, String[] words) {  
        v=new boolean[words.length];
        int cnt=0;
	    dfs(begin, target, words, cnt);
        return answer;
    }
}