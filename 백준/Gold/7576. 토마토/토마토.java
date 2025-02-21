import java.io.*;
import java.util.*;
/**
 * 6 4
 * 1 -1 0 0 0 0
 * 0 -1 0 0 0 0
 * 0 0 0 0 -1 0
 * 0 0 0 0 -1 1
 * 
 * 6
 * */
public class Main {
    static int m,n; // m가로 n세로
    static int[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int count = 0;
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==1){
                    queue.add(new int[] {i, j});
                }
            }
        }
        System.out.println(bfs());
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
    private static int bfs(){
        while(!queue.isEmpty()){
             int[] tmp = queue.poll();
             int x = tmp[0];
             int y = tmp[1];

             // 사방탐색
            for(int k=0;k<4;k++){
                int nx = x + dx[k];
                int ny = y + dy[k];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(map[nx][ny] == 0){
                        queue.add(new int[] {nx, ny});
                        map[nx][ny] = map[x][y] + 1;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]==0){
                    return -1;
                }
                count = Math.max(count, map[i][j]);
            }
        }
        if(count == 1){
            return 0;
        } else {
            return count-1;
        }
    }
}
