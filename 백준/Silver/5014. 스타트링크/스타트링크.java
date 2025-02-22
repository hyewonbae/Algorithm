import java.io.*;
import java.util.*;
/**
 * 10 1 10 2 1
 *
 * 6
 * */
public class Main {
    static int f, s, g, u, d; // 건물 높이, 현재 위치, 목표 위치, Up, Down
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        f = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        u = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        bfs();
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[f + 1]; // 방문 체크 및 이동 횟수 저장
        Arrays.fill(visited, -1); // 초기값 -1 (방문 안 함)

        q.add(s);
        visited[s] = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == g) {
                System.out.println(visited[cur]);
                return;
            }

            // 위로 이동 (U)
            if (cur + u <= f && visited[cur + u] == -1) {
                visited[cur + u] = visited[cur] + 1;
                q.add(cur + u);
            }
            // 아래로 이동 (D)
            if (cur - d >= 1 && visited[cur - d] == -1) {
                visited[cur - d] = visited[cur] + 1;
                q.add(cur - d);
            }
        }
        System.out.println("use the stairs");
    }
}
