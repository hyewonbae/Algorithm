import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N,L,R;
    static int[][] map;
    static boolean[][] visited = new boolean[N][N];
    public static boolean movePopulationBfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        List<int[]> union = new ArrayList<>();

        q.add(new int[]{x, y});
        union.add(new int[]{x, y});
        visited[x][y] = true;

        int sum = map[x][y];

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx<0 || ny<0 || nx>=N || ny>=N || visited[nx][ny]) continue;

                int diff = Math.abs(map[nx][ny] - map[cur[0]][cur[1]]);
                if(diff <= R && diff >= L){
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                    union.add(new int[]{nx, ny});
                    sum += map[nx][ny];
                }
            }
        }
        if(union.size() < 2) return false;
        int avg = sum / union.size();
        for(int[] pos : union){
            map[pos[0]][pos[1]] = avg;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//        for(int i=0; i<N; i++){
//            for(int j=0; j<N; j++){
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }

        int days = 0;
        while(true){
            visited = new boolean[N][N];
            boolean isMoved = false;

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(!visited[i][j] && movePopulationBfs(i,j)){
                        isMoved = true;
                    }
                }
            }
            if(!isMoved) break;
            days++;
        }
        System.out.println(days);
    }
}

