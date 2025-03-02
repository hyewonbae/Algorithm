import java.io.*;
import java.util.*;
/**
 * 6 4
 * 0100
 * 1110
 * 1000
 * 0000
 * 0111
 * 0000
 * 
 * 15
 * */
public class Main {
    static int n,m;
    static int[][] map;
    static boolean[][][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    private static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,1,0});
        visited[0][0][0] = true;

        while (!q.isEmpty()) {
            int[] arr = q.poll();
            int x = arr[0];
            int y = arr[1];
            int dist = arr[2];
            int wall = arr[3];

            if(x == n-1 && y == m-1){
                return dist;
            }

            for(int i = 0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx<0 || ny<0 || nx>=n || ny>=m)continue;
                if(map[nx][ny]==0 && !visited[nx][ny][wall]){
                    visited[nx][ny][wall] = true;
                    q.add(new int[]{nx,ny,dist+1,wall});
                }else if(map[nx][ny]==1 && wall == 0 && !visited[nx][ny][1]){
                    visited[nx][ny][1] = true;
                    q.add(new int[]{nx,ny,dist+1,1});
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m][2];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }

        System.out.println(bfs());
    }
}
