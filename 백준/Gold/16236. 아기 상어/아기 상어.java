import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int size;
    static int fish;
    static int time;
    static int startX,startY;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        size = 2;
        fish = 0;
        startX = 0;
        startY = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 9){
                    startX = i;
                    startY = j;
                    map[i][j] = 0;
                }
            }
        }
        while(true){
            int[] next = bfs(startX, startY);    // 먹을 수 있는 물고기
            if(next == null) break;

            int nx = next[0];
            int ny = next[1];
            int dist = next[2];

            time += dist;
            fish++;

            if(fish == size){
                size++;
                fish = 0;
            }

            map[nx][ny] = 0;
            startX = nx;
            startY = ny;
        }
        System.out.println(time);
    }
    public static int[] bfs(int i, int j){
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();
        PriorityQueue<int[]> fishes = new PriorityQueue<>((a,b)-> {
            if(a[2] != b[2]) return a[2] - b[2];    // 거리
            if(a[0] != b[0]) return a[0] - b[0];    // 행
            return a[1] - b[1];     // 열
        });
        q.add(new int[]{i,j,0});
        visited[i][j] = true;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            for(int k = 0; k < 4; k++){
                int nx = curr[0] + dx[k];
                int ny = curr[1] + dy[k];
                if(nx < 0 || ny < 0 || nx >= n || ny >= n || visited[nx][ny] || map[nx][ny] > size ) continue;
                visited[nx][ny] = true;
                if(map[nx][ny] > 0 && map[nx][ny] < size){
                    fishes.add(new int[]{nx,ny,curr[2]+1});
                }
                q.add(new int[]{nx,ny,curr[2]+1});
            }

        }
        if(fishes.isEmpty()) return null;
        return fishes.poll();
    }
}
