import java.io.*;
import java.util.*;


public class Main {
    static final int[] di = {-1, 0, 1, 0}; // 상, 우, 하, 좌
    static final int[] dj = {0, 1, 0, -1};
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int minH = Integer.MAX_VALUE;
    static int maxH = Integer.MIN_VALUE;
    static int maxSafeArea = 0;

    static void bfs(int startI, int startJ, int h) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        visited[startI][startJ] = true;
        queue.offer(new int[]{startI, startJ});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int ci = current[0];
            int cj = current[1];

            for (int d = 0; d < 4; d++) {
                int ni = ci + di[d];
                int nj = cj + dj[d];
                if (ni >= 0 && ni < N && nj >= 0 && nj < N && !visited[ni][nj] && map[ni][nj] > h) {
                    visited[ni][nj] = true;
                    queue.offer(new int[]{ni, nj});
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        // 입력 받기 및 최소, 최대 높이 구하기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] < minH) minH = map[i][j];
                if (map[i][j] > maxH) maxH = map[i][j];
            }
        }

        // 모든 높이에 대해 탐색하면서 최대 안전 영역 개수 구하기
        for (int h = minH - 1; h <= maxH; h++) { // minH-1 부터 maxH 까지 돌림
            int safeAreaCount = 0;
            visited = new boolean[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && map[i][j] > h) {
                        bfs(i, j, h);
                        safeAreaCount++;
                    }
                }
            }

            maxSafeArea = Math.max(maxSafeArea, safeAreaCount);
        }

        System.out.println(maxSafeArea);

        br.close();
    }
}
