import java.io.*;
import java.util.*;

public class Main {
	static int[] arr;
	static int[] lotto;
	static boolean[] v;
	static int N;
	static StringBuilder sb=new StringBuilder();
	static void comb(int cnt, int start) {
		if(cnt==6) {
			for (int v: lotto) {
                sb.append(v).append(" ");
            }
            sb.append('\n');
			return;
		}
		for(int i=start;i<N;i++) {
			if(v[i]) continue;
			v[i]=true;
			lotto[cnt]=arr[i];
			comb(cnt+1,i+1);
			v[i]=false;
		}
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			N=Integer.parseInt(st.nextToken());
					
			if(N==0) {
				
				break;
			}else {
				arr=new int[N];
				lotto = new int[6];
				v = new boolean[N];
				for (int i = 0; i < N; i++) {
					arr[i]=Integer.parseInt(st.nextToken());
				}
				comb(0,0);
				System.out.println(sb);
				sb.setLength(0); 
				
			}
	//            for(int b: arr)System.out.print(b+ " ");
		}
	}

}
