import java.util.*;
import java.io.*;
//부분집합 
public class Main {
	static int minTaste;	// 최솟값을 저장할 변수
	static boolean[] isSelected;	// 재료 선택 여부를 저장하는 배열
	static int[][] taste; 	// 재료의 신맛과 쓴맛을 저장하는 배열
	static int N;		// 재료의 개수
	
	static void subs(int cnt,int tasteSour,int tasteBitter) {
		
		if(cnt==N) {
			int falseCnt=0;
			
			for(int i=0;i<N;i++) {
				if(isSelected[i]) continue;
				falseCnt++;
			}
			
			if(falseCnt==N) return;
			minTaste=Math.min(minTaste, Math.abs(tasteSour-tasteBitter));
			return;
		}
		
		isSelected[cnt]=true;
		subs(cnt+1,tasteSour*taste[cnt][0],tasteBitter+taste[cnt][1]);
		
		isSelected[cnt]=false;
		subs(cnt+1,tasteSour,tasteBitter);
		
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());	
		
		isSelected=new boolean[N];
		minTaste=Integer.MAX_VALUE;	//최솟값 초기화
		taste=new int[N][2];	// 재료의 신맛과 쓴맛을 저장할 배열 초기화
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			taste[i][0]=Integer.parseInt(st.nextToken());
			taste[i][1]=Integer.parseInt(st.nextToken());			
		}
		
		subs(0,1,0);
		
		System.out.println(minTaste);
		
		
	}
}
