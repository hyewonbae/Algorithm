import java.io.*;
import java.util.*;

public class Main {
	static int[][] map;
	static void sudoku(int row, int col) {
		if(col==9) {
			sudoku(row+1,0);
			return;
		}
		if(row==9) {
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					sb.append(map[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.println(sb);
			System.exit(0);
		}
		
		
		if(map[row][col]==0) {
			for(int i=1;i<=9;i++) {
				if(isAvailable(row,col,i)) {
					map[row][col]=i;
					sudoku(row,col+1);						
				}
			}
			map[row][col]=0;
			return;
		}
		sudoku(row,col+1);
	}
	
	static boolean isAvailable(int row, int col, int value) {
		
		//같은 행에 있는 원소들 중 겹치는 원소 있는지 검사
		for(int i=0;i<9;i++) {
			if(map[row][i]==value) {
				return false;
			}
		}
		//같은 열에 있는 원소들 중 겹치는 원소 있는지 검사
		for(int i=0;i<9;i++) {
			if(map[i][col]==value) {
				return false;
			}
		}
		//3*3 칸에 중복되는 원소가 있는지 검사
		int set_row=(row/3)*3;
		int set_col=(col/3)*3;
		
		for(int i=set_row;i<set_row+3;i++) {
			for(int j=set_col;j<set_col+3;j++) {
				if(map[i][j]==value) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		map=new int[9][9];
		for(int i=0;i<9;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<9;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		sudoku(0,0);
	}

}
