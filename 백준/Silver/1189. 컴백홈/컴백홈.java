import java.io.*;
import java.util.*;

public class Main {
	static final int[] di= {-1,0,1,0};	//상우하좌
	static final int[] dj= {0,1,0,-1};
	static int R,C,K,count,pathCnt=0;
	static char[][] map;
	static boolean[][]v;
	static void dfs(int i, int j, int depth) {
		if (i==0 && j==C-1 && depth==K) {
			pathCnt++;
			return;			
		}
		if(map[i][j]=='.' && !v[i][j]) {
			v[i][j]=true;
			for(int d=0;d<4;d++) {
				int ni=i+di[d];
				int nj=j+dj[d];
				if(0<=ni&&ni<R && 0<=nj&&nj<C && !v[ni][nj] && map[ni][nj]!='T') {
					dfs(ni,nj,depth+1);
				}
			}
			v[i][j] = false;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		R=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		map=new char[R][C];
		v=new boolean[R][C];
		int count=0;
		
		for (int i=0; i<R; i++) {
            String input=br.readLine();
            for (int j=0; j<C; j++) {
                map[i][j]=input.charAt(j);
            }
        }

		dfs(R-1,0,1);
		
		System.out.print(pathCnt);
		br.close();
	}

}
