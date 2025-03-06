import java.io.*;
import java.util.*;
/**
 * 2 3
 * 1 2 4
 * 8 16 32
 * 3
 * 1 1 2 3
 * 1 2 1 2
 * 1 3 2 3
 * 
 * 63
 * 2
 * 36
 * */
public class Main {
    static int[][] arr;
    static int n, m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        int k = Integer.parseInt(br.readLine());
        for(int c = 0; c < k; c++){
            st = new StringTokenizer(br.readLine()," ");
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            findSum(i,j,x,y);
        }
        System.out.println(sb);
    }
    private static void findSum(int i, int j, int x, int y){
        int sum = 0;
        for(int a = i; a <= x; a++){
            for(int b = j; b <= y; b++){

                sum += arr[a][b];
            }
        }

        sb.append(sum).append("\n");
    }
}
