import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static int[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int year = 0;
        while(true){
            int count = countIceBerg();
            if(count == 0){
                System.out.println(0);
                break;
            }
            if(count >= 2){
                System.out.println(year);
                break;
            }

            melt();
            year++;
        }
    }
    public static void bfs(int i, int j, boolean[][] visited){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        visited[i][j] = true;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0],y = cur[1];
            for(int k = 0; k < 4; k++){
                int nx = cur[0] + dx[k];
                int ny = cur[1] + dy[k];

                if(nx<0 || ny<0 || nx>=n || ny>=m || visited[nx][ny] || map[nx][ny] <= 0) continue;
                visited[nx][ny] = true;
                q.add(new int[]{nx,ny});
            }
        }

    }
    public static int countIceBerg(){
        int count = 0;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j] > 0 && !visited[i][j]){
                    visited[i][j] = true;
                    bfs(i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }
    public static void melt(){
        int[][] decrease = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j] > 0){
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if(nx < 0 || ny < 0 || nx >= n || ny >= m || map[nx][ny] > 0) continue;
                        decrease[i][j]++;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = Math.max(0,map[i][j] - decrease[i][j]);
            }
        }
    }
}
