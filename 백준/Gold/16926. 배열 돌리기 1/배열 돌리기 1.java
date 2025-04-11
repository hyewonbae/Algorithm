import java.io.*;
import java.util.*;

public class Main {
    static int n, m, r;
    static int[][] map;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int layerCnt = Math.min(n,m) / 2;

        for(int i = 0; i < r; i++) {
            rotate(map, n, m, layerCnt);
        }

        StringBuilder sb = new StringBuilder();
        for(int[] row : map) {
            for(int value : row){
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
    public static void rotate(int[][] map, int n, int m, int layerCnt) {
        for(int layer = 0; layer < layerCnt; layer++) {
            int top = layer;
            int bottom = n-1-layer;
            int left = layer;
            int right = m-1-layer;

            // 시작점 임시 저장
            int temp = map[top][left];

            // 위쪽, 좌로 밀기
            for(int i = left; i < right; i++) {
                map[top][i] = map[top][i+1];
            }
            // 오른쪽, 위로 올리기
            for(int i = top; i < bottom; i++) {
                map[i][right] = map[i+1][right];
            }
            // 아래쪽, 우로 밀기
            for(int i = right; i > left; i--) {
                map[bottom][i] = map[bottom][i-1];
            }
            // 왼쪽, 아래로 내리기
            for(int i = bottom; i > top; i--) {
                 map[i][left] = map[i-1][left];
            }
            map[top+1][left] = temp;
        }
    }
}
