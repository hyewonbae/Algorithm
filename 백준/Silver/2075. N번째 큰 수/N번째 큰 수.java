/**
 * 5
 * 12 7 9 15 5
 * 13 8 11 19 6
 * 21 10 26 31 16
 * 48 14 28 35 25
 * 52 20 32 41 49
 *
 * 35
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Integer [] arr = new Integer[n*n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i*n+j] = map[i][j];
            }
        }
        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬
        System.out.println(arr[n-1]);
    }
}