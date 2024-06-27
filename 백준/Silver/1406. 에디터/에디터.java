import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<Character> s=new ArrayDeque<>();
		
		String line = br.readLine();
		for(int i=0; i<line.length(); i++) {
			s.push(line.charAt(i));
		}
		int m = Integer.parseInt(br.readLine());
		
		ArrayDeque<Character> dS=new ArrayDeque<>();
		
		for(int i=0; i<m; i++) {
			String op = br.readLine();
			char o = op.charAt(0);
			
			if(o == 'L') {
				if(!s.isEmpty()) {
					dS.push(s.pop());
				}
			}else if(o == 'D') {
				if(!dS.isEmpty()) {
					s.push(dS.pop());
				}
			}else if(o == 'B') {
				if(!s.isEmpty()) {
					s.pop();
				}
			}else {
				s.push(op.charAt(2));
			}
		}
		
		while(!dS.isEmpty()) {
			s.push(dS.pop());
		}
		
		
		StringBuilder sb = new StringBuilder();
		for (char c : s) {
			sb.append(c);
		}
		sb.reverse();
		System.out.println(sb.toString());

        br.close();
	}
}

