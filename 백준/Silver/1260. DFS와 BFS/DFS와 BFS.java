import java.io.*;
import java.util.*;

public class Main {
	static int N,V;
	static int[][] g;
	static boolean[] v;
	
	static void dfs(int num) {
		v[num]=true;
		System.out.print(num+" ");
		for(int j=1;j<=N;j++) {
			if(g[num][j]!=0 && !v[j]) {
				dfs(j);
			}
		}
	}
	
	static void bfs(int num) {
		ArrayDeque<Integer> q=new ArrayDeque<>();
		v[num]=true;
		q.offer(num);
		while(!q.isEmpty()) {
			num=q.poll();
			System.out.print(num+" ");
			for(int j=1;j<=N;j++) {
				if(g[num][j]!=0 && !v[j]) {
					v[j]=true;
					q.offer(j);
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		int E=Integer.parseInt(st.nextToken());
		V=Integer.parseInt(st.nextToken());
		g=new int[N+1][N+1];
		v=new boolean[N+1];
		for(int i=0;i<E;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int from=Integer.parseInt(st.nextToken());
			int to=Integer.parseInt(st.nextToken());
			g[from][to]=1;
			g[to][from]=1;
		}
//		for(int[] a:g)System.out.println(Arrays.toString(a));System.out.println();
		
		dfs(V);
		Arrays.fill(v, false);
		System.out.println();
		bfs(V);

		br.close();
	}


}
