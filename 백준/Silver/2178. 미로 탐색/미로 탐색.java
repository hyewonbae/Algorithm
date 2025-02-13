import java.io.*;
import java.util.*;

//bfs
public class Main {
	static final int[] di= {-1,0,1,0};	//상우하좌
	static final int[] dj= {0,1,0,-1};
	static int N,M;
	static int[][] map;
	static boolean[][] v;
	static int count;
	static void bfs(int i, int j) {
		ArrayDeque<int[]> q=new ArrayDeque<>();
		v[i][j]=true;
		q.offer(new int[]{i,j,1});
		
		while(!q.isEmpty()) {
			count++;
			int[] ij=q.poll();
			i=ij[0];
			j=ij[1];
			int c=ij[2]; 	//횟수
			if(i==N-1 && j==M-1) {
				count=c;
				return;
			}
			for(int d=0;d<4;d++) {
				int ni=i+di[d];
				int nj=j+dj[d];
				if(0<=ni&&ni<N && 0<=nj&&nj<M && !v[ni][nj] && map[ni][nj] == 1) { 
					v[ni][nj]=true;
					q.offer(new int[]{ni,nj,c+1});
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		map=new int[N][M];
		v=new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			for(int j=0;j<M;j++) {
				map[i][j]=str.charAt(j)-'0';
			}
		}
//		for(int[]b :map)System.out.println(Arrays.toString(b));
		bfs(0,0);
		System.out.println(count);
	}

}
