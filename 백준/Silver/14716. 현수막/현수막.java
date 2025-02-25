import java.io.*;
import java.util.*;
/**
 * 8 19
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 1 0 0 0 1 0 0 0 1 0 1 1 1 1 1 0
 * 0 0 1 0 1 0 0 1 1 0 0 1 0 0 0 1 0 0 0
 * 0 1 0 0 0 1 0 1 0 1 0 1 0 0 0 1 0 0 0
 * 0 1 1 1 1 1 0 1 0 1 0 1 0 0 0 1 0 0 0
 * 0 1 0 0 0 1 0 1 0 0 1 1 0 0 0 1 0 0 0
 * 0 1 0 0 0 1 0 1 0 0 0 1 0 0 0 1 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 
 * 3
 * */
public class Main {
    static int n, m;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
    static boolean[][] visited;
    static int cnt;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }

        cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j]==1 && !visited[i][j]){
                    bfs(i, j);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
    private static void bfs(int i, int j) {
        visited[i][j] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            for(int k=0;k<8;k++){
                int nx = x + dx[k];
                int ny = y + dy[k];
                if(nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny] || map[nx][ny] == 0) continue;

                visited[nx][ny] = true;
                q.add(new int[]{nx, ny});
            }
        }
    }
}
