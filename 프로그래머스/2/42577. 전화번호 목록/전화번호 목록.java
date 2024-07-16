import java.io.*;
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer=true;
        Set<String>set=new HashSet<>();

		for(String number : phone_book) {
		    set.add(number);
		}
		
		// number: 1235
		for(String number : phone_book) {
			//"1", "12", "123"
			for(int i=1;i<number.length();i++) {
				if(set.contains(number.substring(0,i))) {		//접두사로 포함하는지 확인 여부
					answer=false;
				}
			}
		}
		return answer;
    }
}