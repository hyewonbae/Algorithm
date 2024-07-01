import java.io.*;
import java.util.*;

public class Main {
	static int N,E;
	static int[][] g;
	static boolean[] v;
	static int count=0;
	static void dfs(int num) {
		v[num]=true;
		for(int j=1;j<=N;j++) {
			if(g[num][j]!=0 && !v[j]) {
				count++;
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
			for(int j=1;j<=N;j++) {
				if(g[num][j]!=0 && !v[j]) {
					v[j]=true;
					q.offer(j);
					count++;
				}
			}
		}
		
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		E=Integer.parseInt(br.readLine());

		g=new int[N+1][N+1];
		v=new boolean[N+1];
		for(int i=0;i<E;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			int from=Integer.parseInt(st.nextToken());
			int to=Integer.parseInt(st.nextToken());
			g[from][to]=g[to][from]=1;
		}
//		for(int[] a:g)System.out.println(Arrays.toString(a));System.out.println();
//		dfs(1);
		bfs(1);
		System.out.println(count);
	}

}
