import java.util.*;
import java.io.*;

public class Solution {
    static int T,N,K, maxLen;
    static int[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean[][] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("res/input_swea_1949.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            map = new int[N][N];
            int maxHeight = 1;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine()," ");
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    maxHeight = Math.max(maxHeight, map[i][j]);
                }
            }
            List<int[]> starts = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(map[i][j] == maxHeight) {
                        starts.add(new int[]{i, j});
                    }
                }
            }
            maxLen = 0;
            for(int[] start : starts){
                visited = new boolean[N][N];
                visited[start[0]][start[1]] = true;
                dfs(start[0], start[1], 1, false);
            }
            sb.append("#").append(t).append(" ").append(maxLen).append("\n");
            init();
        }
        System.out.println(sb);


    }
    public static void dfs(int x, int y, int length, boolean cutUsed){
        maxLen = Math.max(maxLen, length);
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= N || ny < 0 || ny >= N || visited[nx][ny]) continue;

            if(map[nx][ny] < map[x][y]){
                visited[nx][ny] = true;
                dfs(nx, ny, length + 1, cutUsed);
                visited[nx][ny] = false;
            } else if(!cutUsed){
                for (int cut = 1; cut <= K; cut++) {
                    if (map[nx][ny] - cut < map[x][y]) {
                        int original = map[nx][ny];
                        map[nx][ny] = original - cut;
                        visited[nx][ny] = true;
                        dfs(nx, ny, length + 1, true);
                        visited[nx][ny] = false;
                        map[nx][ny] = original;
                    }
                }
            }
        }
    }
    public static void init(){
        N = 0;
        K = 0;
    }
}
