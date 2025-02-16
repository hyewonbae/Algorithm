import java.io.*;
import java.util.*;
/**
 * 5 7 3
 * 0 2 4 4
 * 1 1 2 5
 * 4 0 6 2
 * 
 * 3
 * 1 7 13 
 * */
public class Main {
    static int[][]map;
    static int m,n,k,count;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new int[m][n];

        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int y=y1; y<y2; y++){
                for(int x=x1; x<x2; x++){
                    map[y][x] = 1;
                }
            }
        }
        ArrayList<Integer> areaCount = new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==0){
                    count = 0;
                    dfs(i,j);
                    areaCount.add(count);
                }
            }
        }
        Collections.sort(areaCount);
        sb.append(areaCount.size()).append("\n");
        for(int i: areaCount){
            sb.append(i + " ");
        }
        System.out.println(sb);
    }
    private static void dfs(int x, int y){
        map[x][y] = 1;
        count++;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx >= m || ny >= n || map[nx][ny] == 1) continue;
            dfs(nx, ny);

        }
    }
}
