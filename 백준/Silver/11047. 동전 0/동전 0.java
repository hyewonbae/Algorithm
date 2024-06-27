import java.io.*;
import java.util.*;

public class Main {
	static int N,K;
	static int count;
	static int[] a;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		a=new int[N];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			a[i]+=Integer.parseInt(st.nextToken());
		}
		
		count=0;
		for(int i=N-1;i>=0;i--) {
			if(a[i]<=K) {
				count+=(K/a[i]);
				K=K % a[i];
			}
		}
		System.out.println(count);
		
		
	}

}
