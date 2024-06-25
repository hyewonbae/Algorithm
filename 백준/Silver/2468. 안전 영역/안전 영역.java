import java.io.*;
import java.util.*;

public class Main {
	static final int[] di = {-1, 0, 1, 0}; // 상,우,하,좌
	static final int[] dj = { 0, 1, 0, -1};
	static int N;
	static int[][]map;
	static boolean[][] v;
	static int minH=Integer.MAX_VALUE;
	static int maxH=Integer.MIN_VALUE;
	static int max =0;
	static ArrayList<Integer> safezone;
	
	static void dfs(int i, int j, int h) {
		v[i][j]=true;
		for(int d=0;d<4;d++) {
			int ni=i+di[d];
			int nj=j+dj[d];
			if(0<=ni&&ni<N && 0<=nj&&nj<N && !v[ni][nj] && map[ni][nj]>h) {
				dfs(ni,nj,h);
			}
		}
	}
	
	static void bfs(int i, int j, int h) {
		ArrayDeque<int[]> q=new ArrayDeque<>();
		v[i][j]=true;
		q.offer(new int[] {i,j});
		
		while(!q.isEmpty()) {
			int[] ij=q.poll();
			i=ij[0];
			j=ij[1];
			for(int d=0;d<4;d++) {
				int ni=i+di[d];
				int nj=j+dj[d];
				if(0<=ni&&ni<N && 0<=nj&&nj<N && !v[ni][nj] && map[ni][nj]>h) {
					v[ni][nj]=true;
					q.offer(new int[]{ni,nj});
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		safezone=new ArrayList<>();
		map=new int[N][N];
		v=new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<N;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				if (map[i][j] > maxH) { 
		            maxH = map[i][j];
		        }
				 if (map[i][j] < minH) { 
		            minH = map[i][j];
		        }
			}
		}
		
		for(int h=minH-1; h<maxH+1; h++) {
			v=new boolean[N][N];
			int count=0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(map[i][j]>h && !v[i][j]) {
						
//						dfs(i,j,h);
						bfs(i,j,h);
						count++;
					}					
				}
				
			}
			max=Math.max(max, count);
		}
		System.out.println(max);
		br.close();
	}


}
