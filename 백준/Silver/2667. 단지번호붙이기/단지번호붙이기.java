import java.io.*;
import java.util.*;

public class Main {
	static final int[] di= {-1,0,1,0};
	static final int[] dj= {0,1,0,-1};
	static int n;
	static int[][] map;
	static boolean[][] v;
	static ArrayList<Integer> houseCounts;

    static int houseCount;
    
	static void dfs(int i,int j) {
		v[i][j]=true;
		houseCount++;
		for(int d=0;d<4;d++) {
			int ni=i+di[d];
			int nj=j+dj[d];
			if(0<=ni && ni<n && 0<=nj && nj<n && !v[ni][nj] && map[ni][nj] ==1) {
				dfs(ni,nj);
			}
		}
	}
	
	
	static void bfs(int i, int j) {
		ArrayDeque<int[]> q=new ArrayDeque<>();
		v[i][j]=true;
		q.offer(new int[]{i,j});

		while(!q.isEmpty()) {
			int[] ij=q.poll();
			i=ij[0];
			j=ij[1];
			houseCount++;
			for(int d=0;d<4;d++) {
				int ni=i+di[d];
				int nj=j+dj[d];
				if(0<=ni&&ni<n && 0<=nj&&nj<n && !v[ni][nj] && map[ni][nj] == 1) {
					v[ni][nj]=true;
					q.offer(new int[]{ni,nj});
				}
			}
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();	
		
		n=Integer.parseInt(br.readLine());
		map=new int[n][n];
		v=new boolean[n][n];
		houseCounts = new ArrayList<>(); 
		
		for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<n; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j]==1 && !v[i][j]) {
					houseCount=0;
//					dfs(i,j);
					bfs(i,j);
					houseCounts.add(houseCount);
				}
			}
		}
		Collections.sort(houseCounts);
		sb.append(houseCounts.size()).append("\n"); // Add the number of complexes found
		for (int count : houseCounts) {
		    sb.append(count).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();		
		// 배열 내용 출력
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                sb.append(map[i][j]);
//            }
//            sb.append("\n");
//        }
//
//        System.out.println(sb.toString());
		br.close();
	}

}
