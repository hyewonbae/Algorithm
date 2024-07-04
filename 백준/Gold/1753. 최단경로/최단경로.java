import java.io.*;
import java.util.*;

//PriorityQueue 버전
public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		StringBuilder sb=new StringBuilder();
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int start=Integer.parseInt(br.readLine());
		
		List<int[]>[] g=new List[N+1];
		for(int i=0;i<N+1;i++) g[i]=new ArrayList<>();
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int from=Integer.parseInt(st.nextToken());
			int to=Integer.parseInt(st.nextToken());
			int cost=Integer.parseInt(st.nextToken());
			g[from].add(new int[] {to,cost});
		}
		
		boolean[] v=new boolean[N+1];
		int[] d=new int[N+1];
		for(int i=1;i<=N;i++)d[i]=Integer.MAX_VALUE;
		
		PriorityQueue<int[]> pq=new PriorityQueue<>((o1,o2)->Integer.compare(o1[1], o2[1]));
		d[start]=0;
		pq.offer(new int[] {start,d[start]});
		while(!pq.isEmpty()) {
			int []vc=pq.poll();
			int min=vc[1];			
			int minVertex=vc[0];
			if(v[minVertex]) continue;
			
			if(minVertex==-1) break;
			v[minVertex]=true;
			
			for(int[] j:g[minVertex]) {
				if(!v[j[0]] && d[j[0]]>min+j[1]) {
							   d[j[0]]=min+j[1];
							   pq.offer(new int[] {j[0],d[j[0]]});
				}
				
			}
		}
		for(int i=1;i<=N;i++) {
            if(d[i]==Integer.MAX_VALUE){
                sb.append("INF").append("\n");
            }else{
                sb.append(d[i]).append("\n");
            }
        }
		System.out.println(sb);
		br.close();
	}

}
