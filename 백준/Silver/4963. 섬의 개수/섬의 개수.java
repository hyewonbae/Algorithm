import java.util.*;
import java.io.*;

//bfs와 dfs
public class Main {
	static final int[] di = {-1, 0, 1, 0, -1, 1, 1, -1}; // 상,우,하,좌,상우,하우,하좌,상좌
	static final int[] dj = {0, 1, 0, -1, 1, 1, -1, -1};
	static int w,h,C=0;
	static int[][] map;
	static boolean[][] v;
	
	
	static void dfs(int i, int j) {
		v[i][j]=true;
		map[i][j]=C++;
		for(int d=0;d<8;d++) {
			int ni=i+di[d];
			int nj=j+dj[d];
			if(0<=ni&&ni<h && 0<=nj&&nj<w && !v[ni][nj] && map[ni][nj] == 1) {
				dfs(ni,nj);
			}
		}
	}
//	static void bfs(int i, int j) {
//		ArrayDeque<int[]> q=new ArrayDeque<>();
//		v[i][j]=true;
//		q.offer(new int[]{i,j});
//		
//		while(!q.isEmpty()) {
//			int[] ij=q.poll();
//			i=ij[0];
//			j=ij[1];
//			map[i][j]=C++;
//			for(int d=0;d<8;d++) {
//				int ni=i+di[d];
//				int nj=j+dj[d];
//				if(0<=ni&&ni<h && 0<=nj&&nj<w && !v[ni][nj] && map[ni][nj] == 1) {
//					v[ni][nj]=true;
//					q.offer(new int[]{ni,nj});
//				}
//			}
//		}
//	}
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();		
		
		while(true) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			w=Integer.parseInt(st.nextToken());
			h=Integer.parseInt(st.nextToken());
			if(w==0 && h==0) break;
			
			map=new int[h][w];
			v=new boolean[h][w];
			int count=0;
			
			for(int i=0;i<h;i++) {
				st=new StringTokenizer(br.readLine());
				for(int j=0;j<w;j++) {
					map[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(map[i][j] ==1 && !v[i][j]) {
						dfs(i,j);
//						bfs(i,j);
						count++;
					}
				}
			}
			sb.append(count).append("\n");
		}
        System.out.print(sb);
		
		br.close();
	}

}
