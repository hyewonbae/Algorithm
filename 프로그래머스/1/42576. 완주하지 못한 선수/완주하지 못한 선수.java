import java.io.*;
import java.util.*;

class Solution {
        static String answer=" ";
	    static String solution(String[] participant, String[] completion) {
		Map<String, Integer> map = new HashMap<>();
            
		// key(참가자 이름) : value(참가자 수: 기본 0)
		// 이미 존재하는 이름은 기존 value 값 + 1
		// getOrDefault(Object key, V DefaultValue)
		for(String part : participant) map.put(part,map.getOrDefault(part, 0) +1);
		
		// key(완주자 이름) : value(참가자 수)
		// 이미 존재하는 이름은 기존 value 값 - 1
		for(String comp : completion) map.put(comp, map.get(comp)-1);
		
		// map의 각 키를 순회
		// 값이 0이 아닌 경우는 참가자가 완주하지 못함
		for(String key : map.keySet()) {
			if(map.get(key) != 0) {
				answer = key;
				break;
			}
		}
		return answer;
        }
}