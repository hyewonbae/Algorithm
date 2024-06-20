import java.io.*;
import java.util.*;

public class Main {
	static int num; // 스위치 개수
	static int[] state; // 스위치 상태
	static int student; // 학생 수
	
	public static void man(int x) {
		int cur=x;
		while(cur < state.length) {
    		if(state[cur] == 0) {
    			state[cur] = 1;
    		}
    		else if(state[cur] == 1) {
    			state[cur] = 0;
    		}
    		cur += x;
    	}
	}
	
	public static void woman(int x) {
		// 현재 위치 스위치 상태 반대로 변경
    	if(state[x] == 0) {
			state[x] = 1;
		}
		else if(state[x] == 1) {
			state[x] = 0;
		}
    	
    	// 대칭 스위치 반대로 변경
    	int count = 1;
    	while((x - count) > 0 && (x + count) < state.length) {
    		if(state[x + count] == state[x - count]) {
    			
    			if(state[x + count] == 0) {
    				state[x + count] = 1;
    				state[x - count] = 1;
    			}
    			else if(state[x + count] == 1) {
    				state[x + count] = 0;
    				state[x - count] = 0;
    			}
    			count++;
    			
    		}
    		else {
    			break;
    		}
    	}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		num = Integer.parseInt(br.readLine()); //스위치 개수
		state = new int[num+1];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i < state.length; i++) {
			state[i] = Integer.parseInt(st.nextToken());
		}
		
		student = Integer.parseInt(br.readLine()); // 2

		for (int i = 0; i < student; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			
			if(gender==1) {
				man(Integer.parseInt(st.nextToken()));
			}else if(gender==2) {
				woman(Integer.parseInt(st.nextToken()));
			}
		}

		 // BufferedWriter를 사용하여 결과 출력
        for (int i = 1; i <= num; i++) {
            bw.write(state[i] + " ");
            if (i % 20 == 0) {
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
	}

}
