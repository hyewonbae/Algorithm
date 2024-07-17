import java.io.*;
import java.util.*;

public class Main {
	static int N,M;
	static int[] a=new int[N], b=new int[M];
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		a=new int[N];
		b=new int[M];
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		comb(0,0);
		
	}

	static void comb(int cnt,int start) {
		if(cnt==M) {
			for(int i=0;i<M;i++)System.out.print(b[i]+ " ");
			System.out.println();
			return;
		}
		
		for(int i=start;i<N;i++) {
			b[cnt]=a[i];
			comb(cnt+1,i+1);
		}
	}

}