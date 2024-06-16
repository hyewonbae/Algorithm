import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();		//StringBuilder은 출력 문자열을 한 번에 모아서 출력, System.out.println보다 효율적
		
		int N = Integer.parseInt(br.readLine());	//정수 개수
		
		 PriorityQueue<Integer> pq = new PriorityQueue<>();		//입력된 정수를 자동으로 정렬된 상태를 유지
		
		for(int i=0;i<N;i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		while(!pq.isEmpty()) {
			sb.append(pq.poll()).append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
