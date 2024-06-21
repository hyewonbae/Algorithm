import java.util.*;
import java.io.*;

public class Main {
	static int N, R, C = 0;
	static int[] a, b;
	static boolean[] v;
	
	static void comb(int cnt,int start) {
		if(cnt==R) {
			for (int i = 0; i < R; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
            C++;
			return;
		}
		for(int i=start;i<N;i++) {
			b[cnt]=a[i];
			comb(cnt+1,i);
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] st = br.readLine().split(" ");
		N = Integer.parseInt(st[0]);
		R = Integer.parseInt(st[1]);
		
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = i + 1; 
		}
		
		b=new int[R];
		
		C=0;		
		comb(0,0);
	}
}
