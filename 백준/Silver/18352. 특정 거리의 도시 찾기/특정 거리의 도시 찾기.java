import java.io.*;
import java.util.*;
/**
 * 4 4 1 1
 * 1 2
 * 1 3
 * 2 3
 * 2 4
 * 
 * 2
 * 3
 * */
public class Main {
    static int n; // 도시 개수
    static int m; // 도로 개수
    static int k; // 거리 정보
    static int x; // 출발 도시 번호
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] dist; // 최단 거리 저장할 배열
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        dist = new int[n+1];
        Arrays.fill(dist,-1);

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        bfs(x);
        List<Integer> result = new ArrayList<>();

        for (int i=1; i<=n; i++){
            if(dist[i] == k){
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            System.out.println("-1");
        } else {
            Collections.sort(result);
            for (int city : result) {
                sb.append(city).append("\n");
            }
            System.out.println(sb);
        }
    }
    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        dist[start] = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int next : graph.get(cur)) {
                if (dist[next] == -1) {
                    dist[next] = dist[cur] + 1;
                    queue.add(next);
                }
            }
        }
    }

}
