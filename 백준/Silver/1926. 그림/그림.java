import java.io.*;
import java.util.*;
/**
 * 6 5
 * 1 1 0 1 1
 * 0 1 1 0 0
 * 0 0 0 0 0
 * 1 0 1 1 1
 * 0 0 1 1 1
 * 0 0 1 1 1
 *
 * 4
 * 9
 * */
public class Main {
    static int n,m;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws Exception {
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
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }
        int area_count = 0;
        int max_count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j]==1 && !visited[i][j]){
                    int cur_count = dfs(i, j);
                    area_count++;
                    max_count = Math.max(max_count, cur_count);
                }
            }
        }
        System.out.println(area_count);
        System.out.println(max_count);
    }
    private static int dfs(int x, int y) {
        int count = 1;
        visited[x][y] = true;
        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if(nx<0||ny<0||nx>=n||ny>=m||map[nx][ny]==0||visited[nx][ny]==true) continue;
            count += dfs(nx, ny);
        }
        return count;
    }
}
