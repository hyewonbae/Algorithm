import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int [][] map;
	static StringBuilder sb = new StringBuilder();

	static boolean isAvailable(int x, int y, int size) {
		
		int value=map[x][y];
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size;j++) {
				if(value!=map[i][j]) {
					return false;
				}
			}	
		}
		return true;
	}
	
	static void QuadTree(int x, int y, int size) {
		if(isAvailable(x,y,size)) {
			sb.append(map[x][y]);
			return;
		}
		
		int newSize=size/2;
		
		sb.append('(');
		
		QuadTree(x        ,y        ,newSize);
		QuadTree(x        ,y+newSize,newSize);
        QuadTree(x+newSize,y        ,newSize);
		QuadTree(x+newSize,y+newSize,newSize);
		
		sb.append(')');
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		map=new int[N][N];
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			for(int j=0;j<N;j++) {
				map[i][j]=str.charAt(j)-'0';
			}
		}
		
		QuadTree(0,0,N);
		System.out.println(sb);
//		for(int[]b :map)System.out.println(Arrays.toString(b));System.out.println();
		
	}

}
