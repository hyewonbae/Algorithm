import java.io.*;
import java.util.*;
/**
 * 4 5 1
 * 1 2
 * 1 3
 * 1 4
 * 2 4
 * 3 4
 * 
 * 1 2 4 3
 * 1 2 3 4
 * */
public class Main {
    static boolean visited[];
    static ArrayList<Integer>A[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        A = new ArrayList[n+1];
        for (int i=1; i<=n; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        for(int i=1; i<=n; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[n+1];
        dfs(start);
        System.out.println();
        visited = new boolean[n+1];
        bfs(start);
        System.out.println();
    }
    private static void bfs(int node) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(node);
        visited[node] = true;
        while(!q.isEmpty()) {
            int cur = q.poll();
            System.out.print(cur+ " ");
            for(int i:A[cur]){
                if(!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }

            }
        }
    }
    private static void dfs(int node) {
        System.out.print(node+ " ");
        visited[node] = true;
        for(int i: A[node]) {
            if(!visited[i]) {
                dfs(i);
            }
        }
    }
}
