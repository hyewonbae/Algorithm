import java.io.*;
import java.util.*;

public class Main {
	static int N,M;
	static int[] indegree;
	static List<Integer>[] g;

	static void bfs() {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		for(int i=1;i<N+1;i++) {
			if(indegree[i]==0) pq.offer(i);
		}
		
		while(!pq.isEmpty()) {
			int i=pq.poll();
			System.out.print(i+" ");
			for(int j:g[i]) {
				if(--indegree[j]==0) pq.offer(j);
			}
					
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		g=new List[N+1];
		for(int i=1;i<N+1;i++) g[i]=new ArrayList<>();
		indegree=new int[N+1];
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int from=Integer.parseInt(st.nextToken());
			int to=Integer.parseInt(st.nextToken());
			g[from].add(to);
			indegree[to]++;
		}
		bfs();
		br.close();
		
		
	}

}
