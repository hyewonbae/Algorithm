import java.io.*;
import java.util.*;
/**
 * 2 4
 * CAAB
 * ADCB
 * 
 * 3
 * */
public class Main {
    static int r,c;
    static char[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static Set<Character> set;
    static int maxCount = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];
        for(int i=0; i<r; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for(int j=0; j<c; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        set = new HashSet<>();
        set.add(map[0][0]);
        dfs(0,0,1);

//        for(int i=1; i<=r; i++) {
//            for(int j=1; j<=c; j++) {
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();
//        }

        System.out.println(maxCount);
    }
    private static void dfs(int x, int y, int count) {
        maxCount = Math.max(maxCount, count);

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx<0 || ny<0 || nx>=r || ny>=c || set.contains(map[nx][ny])) continue;
            set.add(map[nx][ny]);
            dfs(nx, ny, count + 1);
            set.remove(map[nx][ny]);
        }
    }
}
