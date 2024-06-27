import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static long[] distance;	//거리
	static long[] prices;	//가격
	static long min=Integer.MAX_VALUE;
	static long price;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		distance=new long[N-1];
		prices=new long[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N-1;i++) {
			distance[i]=Integer.parseInt(st.nextToken());
		}
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			prices[i]=Integer.parseInt(st.nextToken());
			
		}
		min=prices[0];
		
		for(int i=0;i<N-1;i++) {
			if(prices[i]<min) {
				min=prices[i];
			}
			
			price+=min*distance[i];
		}
		System.out.println(price);
		
	}

}
