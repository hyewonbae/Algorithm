import java.io.*;
import java.util.*;

class Solution {
    static boolean[][] visited;
    static final int[] di = {-1, 0, 1, 0}; // 상, 우, 하, 좌 방향
    static final int[] dj = {0, 1, 0, -1};
    static int[][] map;

    static int bfs(int startX, int startY, int[][] maps) {
        int answer=0;
        ArrayDeque<int[]> queue = new ArrayDeque<>();

        // 시작점을 방문처리 후 큐에 추가
        visited[startX][startY] = true;
        queue.offer(new int[]{startX, startY, 1}); // (x, y, 거리)

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            // 도착 지점에 도달한 경우
            if (x == maps.length - 1 && y == maps[0].length - 1) {
                answer = distance;
                return answer;
            }

            // 사방탐색
            for (int d = 0; d < 4; d++) {
                int nx = x + di[d];
                int ny = y + dj[d];

                // 배열 범위와 방문 여부, 값 확인
                if (0 <= nx && nx < maps.length && 0 <= ny && ny < maps[0].length && !visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, distance + 1});
                }
            }
        }
        return -1; // 도달할 수 없는 경우 -1 반환
    }
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        visited = new boolean[n][m];
        
        return bfs(0, 0, maps); // 시작점을 (0,0)으로 설정
    }
}