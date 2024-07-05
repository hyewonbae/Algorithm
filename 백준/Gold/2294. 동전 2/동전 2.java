import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		int[] dp=new int[N+1];
		int[] coin=new int[M];
		for(int i=0;i<M;i++) {
			coin[i]=sc.nextInt();
		}
		Arrays.fill(dp, Integer.MAX_VALUE); dp[0]=0;
		
		for(int i=0;i<coin.length;i++) {
			for(int j=coin[i];j<=N;j++) {
				if (dp[j-coin[i]] != Integer.MAX_VALUE) {
                    dp[j]=Math.min(dp[j],dp[j-coin[i]]+1);
                }
			}
		}
		 if(dp[N]==Integer.MAX_VALUE) {
	            System.out.println("-1"); // 목표 금액을 만들 수 없는 경우
	        }else{
	            System.out.println(dp[N]);
	        }
	        
	 	sc.close();
	}

}
