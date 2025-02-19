import java.util.*;
import java.io.*;
/**
 * 3 3
 * 255 255 255 100 100 100 255 255 255
 * 100 100 100 255 255 255 100 100 100
 * 255 255 255 100 100 100 255 255 255
 * 101
 * 
 * 5
 * */
public class Main {
    static int n,m,t;
    static int r,g,b;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int cnt;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                r = Integer.parseInt(st.nextToken());
                g = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                map[i][j] = (r+g+b)/3;
            }
        }

        t = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]>=t){
                    map[i][j] = 255;
                }else{
                    map[i][j] = 0;
                }
            }
        }

//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(map[i][j]);
//            }
//            System.out.println();
//        }
        visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]>=255 && !visited[i][j]){
                    dfs(i,j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    private static void dfs(int i,int j){
        visited[i][j] = true;
        for(int k=0;k<4;k++){
            int nx = i+dx[k];
            int ny = j+dy[k];
            if(nx<0||ny<0||nx>=n||ny>=m||visited[nx][ny]||map[nx][ny]==0)continue;
            dfs(nx,ny);
        }
    }
}
