import java.io.*;
import java.util.*;
/**
 * 7
 * 0110100
 * 0110101
 * 1110101
 * 0000111
 * 0100000
 * 0111110
 * 0111000
 * 
 * 3
 * 7
 * 8
 * 9
 * */
public class Main {
    static int[][] graph;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int n, danji;
    static ArrayList<Integer> houseCount = new ArrayList<>();
    private static int dfs(int i, int j) {
        visited[i][j] = true;
        int count = 1;
        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            if( nx < 0 || ny < 0 || nx >= n || ny >= n || graph[nx][ny] == 0 || visited[nx][ny] == true ) continue;
            count += dfs(nx, ny);

        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(graph[i][j] == 1 && !visited[i][j]) {
                    houseCount.add(dfs(i, j));
                    danji++;
                }
            }
        }
        Collections.sort(houseCount);
        System.out.println(danji);
        for (int count: houseCount) {
            System.out.println(count);
        }
    }
}
