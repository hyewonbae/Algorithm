/**
 * 5 4
 * 1 2 3
 * 3 4 4
 * 1 4 1
 * 2 2 2
 *
 * 1 2 1 1 0
 *
 * 바구니 1 2 3 4 5
 *      3 3 4 4 0
 *      1 1 1 1 0
 *      1 2 1 1 0
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            for(int j=a; j<=b; j++){
                arr[j] = c;
            }
        }
        for(int i=1; i<=n; i++){
            System.out.print(arr[i]+ " ");
        }
        br.close();
    }
}
