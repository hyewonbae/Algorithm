import java.io.*;
import java.util.*;

//다익스트라 + sb
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

		d[start]=0;
		for(int i=0;i<N;i++) {
			int min=Integer.MAX_VALUE;
			int minVertex=-1;
			
			for(int j=1;j<=N;j++) {
				if(!v[j] && min>d[j]) {
							min=d[j];
							minVertex=j;
				}
			}
			
			if(minVertex==-1) break;
			v[minVertex]=true;
			for(int[] j:g[minVertex]) {
				if(!v[j[0]] && d[j[0]]>min+j[1]) {
							   d[j[0]]=min+j[1];
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
