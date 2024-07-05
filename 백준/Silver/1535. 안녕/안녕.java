import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();	//8
		int []health=new int[N];
		int []happiness=new int[N];
		
		for(int i=0;i<N;i++) {
			health[i]=sc.nextInt();	
		}
		for(int i=0;i<N;i++) {
			happiness[i]=sc.nextInt();	
		}
		int [][]dp=new int[N+1][101];
		
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<100;j++) {
				if(health[i-1]<=j) {
					dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-health[i-1]]+happiness[i-1]);
							
				} else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		int maxHappiness=0;
		for(int i=1;i<100;i++) {
			maxHappiness=Math.max(maxHappiness, dp[N][i]);
		}
		System.out.println(maxHappiness);
		sc.close();
	}

}
