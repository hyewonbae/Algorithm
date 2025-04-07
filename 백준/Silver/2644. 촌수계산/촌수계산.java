import java.io.*;
import java.util.*;
/**
 * 부모 - 자식 1촌
 * 할아버지 - 나 2촌
 * 아버지 형제 - 할아버지 1촌
 * 나 - 아버지 형제 3촌
 * */
public class Main {
    static int n,a,b,k;
    static int[][] graph;
    static boolean[] visited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        a = Integer.parseInt(st.nextToken());   // 7
        b = Integer.parseInt(st.nextToken());   // 3
        k = Integer.parseInt(br.readLine());

        graph = new int[n+1][n+1];
        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine()," ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = 1;
            graph[v][u] = 1;
        }
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print(graph[i][j]+ " ");
//            }
//            System.out.println();
//        }
        visited = new boolean[n+1];
        System.out.println(bfs(a,0));
    }
    public static int bfs(int start, int count){
        Queue<int[]> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(new int[]{start, count});
        while(!queue.isEmpty()){
            int[] curNode = queue.poll();
            if(curNode[0] == b) return curNode[1];
            for(int i=1; i<=n; i++){
                if(graph[curNode[0]][i]==1 && !visited[i]){
                    visited[i] = true;
                    queue.add(new int[]{i, curNode[1]+1});
                }
            }
        }
        return -1;
    }
}
