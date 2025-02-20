import java.io.*;
import java.util.*;
/**
 * 3 4 5
 * 3 2
 * 2 2
 * 3 1
 * 2 3
 * 1 1
 *
 * 4
 * */
public class Main {
    static int n,m,k;
    static int[][] map;
    static int maxArea = 0;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a-1][b-1] = 1;
        }

//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]==1 && !visited[i][j]){
                    int areaCount = dfs(i,j);
                    maxArea = Math.max(areaCount,maxArea);
                }
            }
        }
        System.out.println(maxArea);
    }
    private static int dfs(int x, int y){
        visited[x][y] = true;
        int count = 1;
        for(int i=0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx<0||ny<0||nx>=n||ny>=m||map[nx][ny]==0||visited[nx][ny]) continue;
            count += dfs(nx,ny);
        }
        return count;
    }
}
