import java.io.*;
import java.util.*;
/**
 * 방향없는 그래프의 연결요소 개수
 * 6 5
 * 1 2
 * 2 5
 * 5 1
 * 3 4
 * 4 6
 * */
public class Main {
    static boolean[] v;
    static int n,m;
    static int[][]map=new int[n+1][n+1];
    static void dfs(int node) {
        if (v[node]) {
            return;
        } else {
            v[node] = true;
            for (int i = 1; i <= n; i++) {
                if (map[node][i] == 1) {
                    dfs(i);
                }
            }
        }
    }
    static void bfs(int node) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (!v[current]) {
                v[current] = true;
                for (int i = 1; i < map.length; i++) {
                    if (map[current][i] == 1 && !v[i]) {
                        queue.offer(i);
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n+1][n+1];
        v = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int from = Integer.parseInt(st.nextToken());
            int to =  Integer.parseInt(st.nextToken());
            map[from][to] = 1;
            map[to][from] = 1;
        }
        int cnt=0;
        for(int i=1;i<=n;i++) {
            if (!v[i]) {
//                dfs(i);
                bfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
