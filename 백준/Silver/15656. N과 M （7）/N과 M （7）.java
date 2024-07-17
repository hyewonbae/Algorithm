import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int M;
	static int[] a,b;
	static StringBuilder sb=new StringBuilder();
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
		perm(0);
		System.out.println(sb.toString());
	}
	static void perm(int cnt) {
		if(cnt==M) {
			for(int i=0;i<M;i++)sb.append(b[i]).append(" ");
			sb.append("\n");
			return;
		}
		
		for(int i=0;i<N;i++) {
			b[cnt]=a[i];
			perm(cnt+1);
		}
	}

}