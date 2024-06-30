import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int M;
	static int[] a;
	static int cnt=0;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		
		a= new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		M=Integer.parseInt(br.readLine());
		for(int b:a)if(M==b)cnt++;
		System.out.println(cnt);
	}

}

