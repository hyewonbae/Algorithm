import java.io.*;
import java.util.*;
/*
 * 1. 재귀
 * 2. 탐색
 */
public class Main {
	static int N;
	static int[][] map;
	static int white;
	static int blue;

	private static void partition(int i, int j, int size) {
		/*
		 * if(현재 부분이 모두 같은 색이라면){
		 * 		현재 색상 1증가 후 return
		 * }
		 */
		if(colorCheck(i,j,size)) {
			if(map[i][j] ==0) {
				white++;
			}else {
				blue++;
			}
			return;
		}
		
		size = size/2;
		partition(i,j,size);
		partition(i+size,j,size);
		partition(i,j+size,size);
		partition(i+size,j+size,size);
		
	}
	
	static boolean colorCheck(int row, int col, int size) {
		/*
		 * 첫번째 원소 기준
		 * for(size만큼 가로 세로 탐색){
		 * 		if(색상이 같이 않으면){
		 * 			return false;
		 * 		}
		 * } 
		 * return true;
		 */
		int color=map[row][col];	//1 또는 0
		
		for(int i=row;i<row+size;i++) {
			for(int j=col;j<col+size;j++) {
				if(map[i][j] != color) return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		
		map=new int[N][N];
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<N;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		white=0;
		blue=0;
		partition(0,0,N);
		
		System.out.println(white);
		System.out.println(blue);
	}

}
