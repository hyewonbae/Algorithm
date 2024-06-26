import java.io.*;
import java.util.*;

//PriorityQueue 사용
public class Main {
	static int N;
	static int[][] a;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		a=new int[N][2];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			a[i][0]=Integer.parseInt(st.nextToken());
			a[i][1]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a,new Comparator<int[]>() {	
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) {
					return o1[1]-o2[1];
				}
				return o1[0]-o2[0];
			}
		});

	
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(a[0][1]);
		
		for(int i=1;i<N;i++) {
			if(pq.peek()<=a[i][0]) pq.poll();
			pq.add(a[i][1]);
		}
		System.out.println(pq.size());
        br.close();
	}

}
