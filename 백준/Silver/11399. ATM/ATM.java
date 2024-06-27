import java.io.*;
import java.util.*;

public class Main {
	static int N,total;
	static int[] sum;
	static int[] a;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		a=new int[N];
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			a[i]+=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);
		
		sum=new int[N];
		int time=0;
		for(int i=0;i<N;i++) {
			time+=a[i];
			sum[i]=time;
		}
		
		for(int i=0;i<N;i++) {
			total+=sum[i];
		}
		System.out.println(total);
		
	}

}
