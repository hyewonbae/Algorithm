import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static int[][] map;
    static int[] dx = {-1,1,0,0,-1,-1,1,1};
    static int[] dy = {0,0,-1,1,-1,1,-1,1};
    static int[][] dist;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        dist = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1){
                    q.add(new int[]{i,j});
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = -1;
                }
            }
        }
        bfs(q);
        int maxSafe = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxSafe = Math.max(maxSafe, dist[i][j]);
            }
        }
        System.out.println(maxSafe);
    }
    public static void bfs(Queue<int[]> q) {
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for(int k=0;k<8;k++){
                int nx = x+dx[k];
                int ny = y+dy[k];

                if(nx<0 || ny<0 || nx>=n || ny>=m || dist[nx][ny]!=-1) continue;
                if(map[nx][ny]==0){
                    dist[nx][ny] = dist[x][y] + 1;
                    q.add(new int[]{nx,ny});
                }
            }
        }
    }
}
