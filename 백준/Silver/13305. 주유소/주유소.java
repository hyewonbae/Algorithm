import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[] distance;	//거리
	static int[] prices;	//가격
	static int min;
	static int price;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		distance=new int[N-1];
		prices=new int[N];
		
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
