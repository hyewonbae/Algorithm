import java.io.*;
import java.util.*;


//PriorityQueue
public class Main {
	static int N;
	static int num;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		N=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		while(pq.size()>1) {
			int temp1=pq.poll();
			int temp2=pq.poll();
			
			num+=temp1+temp2;
			pq.add(temp1+temp2);
		}
		
		System.out.println(num);
	}
	
	
}