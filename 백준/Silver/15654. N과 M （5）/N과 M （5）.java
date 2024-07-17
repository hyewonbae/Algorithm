import java.io.*;
import java.util.*;

public class Main {
	static int N,M;
	static int[] a=new int[N], b=new int[M];
	static boolean[]v=new boolean[N];
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		a=new int[N];
		b=new int[M];
		v=new boolean[N];
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		perm(0);
		
	}

	static void perm(int cnt) {
		if(cnt==M) {
			for(int i=0;i<M;i++)System.out.print(b[i]+ " ");
			System.out.println();
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(v[i]) continue;
			v[i]=true;
			b[cnt]=a[i];
			perm(cnt+1);
			v[i]=false;
		}
	}

}