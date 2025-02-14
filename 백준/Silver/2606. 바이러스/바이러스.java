import java.io.*;
import java.util.*;
/**
 * 7
 * 6
 * 1 2
 * 2 3
 * 1 5
 * 5 2
 * 5 6
 * 4 7
 * 
 * 4
 * */
public class Main {
    static boolean visited[];
    static ArrayList<Integer> A[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    //7
        int m = Integer.parseInt(br.readLine());    //6
        A = new ArrayList[n+1];

        for (int i=1; i<=n; i++){
            A[i] = new ArrayList<>();
        }
        for (int i=0; i<m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        visited = new boolean[n+1];
        int result = dfs(1);
        System.out.println(result);
    }
    private static int dfs(int s) {
        visited[s] = true;
        int count = 0;
        for(int i: A[s]){
            if(!visited[i]){
                count += dfs(i) + 1;

            }
        }
        return count;
    }
}
