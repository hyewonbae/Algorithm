import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static int r,c,d;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = bfs(r,c,d);
        System.out.println(result);
    }
    public static int bfs(int r, int c, int d) {
        int count = 0;

        while(true){
            if(!visited[r][c]){
                visited[r][c] = true;
                count++;
            }
            boolean moved = false;
            for(int i = 0; i < 4; i++){
                d = (d + 3) % 4;
                int nx = r + dx[d];
                int ny = c + dy[d];

                if(nx>=0 && ny>=0 && nx<n && ny<m){
                    if(map[nx][ny]==0 && !visited[nx][ny]){
                        r = nx;
                        c = ny;
                        moved = true;
                        break;
                    }
                }
            }

            if(!moved){
                int back = (d + 2) % 4;
                int bx = r + dx[back];
                int by = c + dy[back];

                if(bx>=0 && by>=0 && bx<n && by<m && map[bx][by]!=1){
                    r = bx;
                    c = by;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
