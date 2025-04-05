import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int maxSafeArea = 0;
    public static void virusBfs(int[][] copiedMap, int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || copiedMap[nx][ny] != 0) continue;
                copiedMap[nx][ny] = 2;
                q.add(new int[]{nx, ny});
            }
        }
    }
    public static void makeWall(int depth){
        if(depth == 3){
            simulateVirus();
            return;
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j] == 0){
                    map[i][j] = 1;
                    makeWall(depth+1);
                    map[i][j] = 0;
                }
            }
        }
    }

    private static void simulateVirus() {
        int[][] copiedMap = new int[N][M];
        for(int i=0; i<N; i++){
            copiedMap[i] = map[i].clone();
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(copiedMap[i][j] == 2) {
                    virusBfs(copiedMap, i, j);
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(copiedMap[i][j] == 0) {
                    cnt++;
                }
            }
        }

        maxSafeArea = Math.max(maxSafeArea, cnt);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        makeWall(0);
        System.out.println(maxSafeArea);
    }
}
