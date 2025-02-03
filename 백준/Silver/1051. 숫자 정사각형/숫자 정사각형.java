import java.io.*;
import java.util.*;
/**
 * 3 5
 * 42101
 * 22100
 * 22101
 *
 * 9
 * */
public class Main {
    static int n, m = Integer.MIN_VALUE;
    static int[][] map;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        int len = Math.min(n, m);
        while (len > 1) {
            for (int i = 0; i <= n-len; i++) {
                for (int j = 0; j <= m-len; j++) {
                    int num = map[i][j];
                    if(num==map[i][j+len-1] && num==map[i+len-1][j] && num==map[i+len-1][j+len-1]){
                        System.out.println(len*len);
                        return;
                    }
                }
            }
            len--;
        }
        System.out.println(len*len);
    }
}
