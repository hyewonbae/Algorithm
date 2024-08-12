import java.io.*;
import java.util.*;
/**
 * N x N 크기의 표에서 (x1,y1)~(x2,y2)까지의 합
 * 입력
 * 4 3
 * 1 2 3 4
 * 2 3 4 5
 * 3 4 5 6
 * 4 5 6 7
 * 2 2 3 4
 * 3 4 3 4
 * 1 1 4 4
 *
 *
 * 결과
 * 27
 * 6
 * 64
 * */
public class Main {

    public static void main(String[] args) throws Exception {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           StringTokenizer st = new StringTokenizer(br.readLine(), " ");
           int N = Integer.parseInt(st.nextToken());
           int M = Integer.parseInt(st.nextToken());
           int [][] map = new int[N+1][N+1];
           int [][] preSum = new int[N+1][N+1];
           int x1, y1, x2, y2;
           for (int i = 1; i <= N; i++) {
               st = new StringTokenizer(br.readLine());
               for (int j = 1; j <= N; j++) {
                   map[i][j] = Integer.parseInt(st.nextToken());


                   // 누적 합 계산
                   preSum[i][j] = map[i][j]
                           + preSum[i-1][j]
                           + preSum[i][j-1]
                           - preSum[i-1][j-1];
               }
           }

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=M;i++){
           st = new StringTokenizer(br.readLine(), " ");
           x1 = Integer.parseInt(st.nextToken());
           y1 = Integer.parseInt(st.nextToken());
           x2 = Integer.parseInt(st.nextToken());
           y2 = Integer.parseInt(st.nextToken());

           int answer = preSum[x2][y2]
                   - preSum[x1-1][y2]
                   - preSum[x2][y1-1]
                   + preSum[x1-1][y1-1];
           sb.append(answer).append("\n");
       }
        System.out.println(sb);

    }
}

