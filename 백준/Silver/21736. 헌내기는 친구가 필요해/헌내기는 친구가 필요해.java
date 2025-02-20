import java.io.*;
import java.util.*;
/**
 * 3 5
 * OOOPO
 * OIOOX
 * OOOXP
 * 
 * 1
 * */
public class Main {
    static int n,m;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int count = 0;
    static int startX,startY;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new char[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                map[i][j] = str.charAt(j);
                if(map[i][j] == 'I'){
                    startX = i;
                    startY = j;
                }
            }
        }

//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }
       dfs(startX, startY);
        if(count == 0){
            System.out.println("TT");
        } else {
            System.out.println(count);
        }
    }
    private static void dfs(int x, int y){
        visited[x][y] = true;
        if(map[x][y] == 'P'){
            count++;
        }
        for(int k=0; k<4; k++){
            int nx = x + dx[k];
            int ny = y + dy[k];
            if(nx<0||ny<0||nx>=n||ny>=m||visited[nx][ny]||map[nx][ny] == 'X'){
                continue;
            }
            dfs(nx, ny);
        }
    }
}
