import java.util.*;
import java.io.*;

public class Main {
	static int a[]=new int[9];
	static int b[]=new int[7];
	static void comb(int cnt,int start) {
		if(cnt==7) {
			int sum=0;
			for(int i=0;i<7;i++) {
				sum+=b[i];
			}
			if(sum==100) {
				for(int i=0;i<7;i++) {
					System.out.println(b[i]);
				}
				return;
				
			}
			return;
		}
		
		for(int i=start;i<9;i++) {
			b[cnt]=a[i];
			comb(cnt+1,i+1);
		}
	}
		
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<9;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}

		comb(0,0);
		
	}
}
