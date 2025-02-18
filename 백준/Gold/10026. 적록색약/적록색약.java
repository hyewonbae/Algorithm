import java.io.*;
import java.util.*;
/**
 * 5
 * RRRBB
 * GGBBB
 * BBBRR
 * BBRRR
 * RRRRR
 * 
 * 4 3
 * */
public class Main {
    static int n;
    static Character[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int nolmalCount;
    static int colorBlindCount;
    static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new Character[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j);
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }

        // 일반인
        visited = new boolean[n][n];
        int nolmalCount = countAreas();

        // 적록색약
        visited = new boolean[n][n];
        convertGreenToRed();
        int colorBlindCount = countAreas();

        System.out.println(nolmalCount + " " + colorBlindCount);

    }
    private static void convertGreenToRed() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 'G') {
                    map[i][j] = 'R';
                }
            }
        }
    }

    private static int countAreas() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j]){
                    dfs(i, j, map[i][j]);
                    count++;
                }
            }
        }
        return count;
    }
    private static void dfs(int x, int y, Character c) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= n || ny >= n || visited[nx][ny] || map[nx][ny] != c) continue;
            dfs(nx, ny, map[nx][ny]);
        }
    }
}
