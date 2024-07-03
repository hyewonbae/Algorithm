import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int E=Integer.parseInt(st.nextToken());
		
		List<int[]>[] g=new List[N];for(int i=0;i<N;i++) g[i]=new ArrayList<>(); // 정점,cost
		
		for(int i=0;i<E;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int from=Integer.parseInt(st.nextToken());
			int to=Integer.parseInt(st.nextToken());
			int cost=Integer.parseInt(st.nextToken());
			g[from-1].add(new int[] {to-1,cost});
			g[to-1].add(new int[] {from-1,cost});
		}
	
		boolean[] v=new boolean[N];
		
		int[]w=new int[N];
		for(int i=0;i<N;i++) {
			w[i]=Integer.MAX_VALUE;
		}
			
		PriorityQueue<int[]> pq=new PriorityQueue<>((o1,o2)->Integer.compare(o1[1], o2[1]));
		int sum=0,cnt=0;
		w[0]=0;
		pq.offer(new int[] {0,0});
		
		while(!pq.isEmpty()) {
			int []vc=pq.poll();
			int min=vc[1];
			int minVertex=vc[0];
			if(v[minVertex])continue;
			
			v[minVertex]=true;
			sum+=min;
			if(cnt++==N-1)break;
			
			for(int[] j:g[minVertex]) {
				if(!v[j[0]] && w[j[0]]>j[1]) {
							   w[j[0]]=j[1];
							   pq.offer(j);
					
				}
			}
//			System.out.println();
		}
	
		System.out.println(sum);
		br.close();
	}

}
