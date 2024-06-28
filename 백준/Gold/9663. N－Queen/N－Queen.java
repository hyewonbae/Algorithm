/**
 * NQueen 4X4 체스판 가로 세로 대각선으로 공격
 * 1차원 배열 사용
 * - 행(i)을 인덱스로 사용
 * - 열(j)을 값으로 사용
 * (i) (j)
 *  0	1
 *  1	3
 *  2	0
 *  3	2
 */
import java.io.*;
import java.util.*;

public class Main {
	static int N,ans,col[];	//N=4
	
	static boolean isAvailable(int rowNo) {
		for(int j=0;j<rowNo;j++) {
			//수직 || 대각선 
			if(col[rowNo]==col[j] || Math.abs(col[rowNo]-col[j])==Math.abs(rowNo-j)) return false;			
		}
		return true;
	}

	static void nqueen(int rowNo) {
		
		if(!isAvailable(rowNo-1)) return;	//backtracking 
		
		if(rowNo==N) {
			ans++;
			return;
		}
		for(int i=0;i<N;i++) {
			col[rowNo]=i;
//			if(isAvailable(rowNo)) nqueen(rowNo+1);		//가지치기 다음으로 갈 수 있을 때를 판별
			nqueen(rowNo+1);		//가지치기 다음으로 갈 수 있을 때를 판별
		}
	}
	

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		
		col=new int[N];
		ans=0;
		nqueen(0);
		System.out.println(ans);
		sc.close();
		
	}


}
