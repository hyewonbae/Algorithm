import java.io.*;
import java.util.*;

public class Main {
    static int t,n;
    static int[] x;
    static int[] y;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            x = new int[n+2];
            y = new int[n+2];
            visited = new boolean[n+2];
            for (int j = 0; j < n+2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                x[j] = Integer.parseInt(st.nextToken());
                y[j] = Integer.parseInt(st.nextToken());
            }

            boolean result = bfs(0);
            System.out.println(result ? "happy" : "sad");
        }
    }

    public static boolean bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int curr = queue.poll();
            // 종료조건
            if(curr == n+1) return true;
            for(int i = 0; i < n+2; i++) {
                if(!visited[i] && distance(curr, i) <= 1000) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return false;
    }
    public static int distance(int a, int b) {
        return Math.abs(x[a] - x[b]) + Math.abs(y[a] - y[b]);
    }
}
