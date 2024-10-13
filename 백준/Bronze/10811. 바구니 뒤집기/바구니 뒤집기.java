/**
 * 5 4
 * 1 2
 * 3 4
 * 1 4
 * 2 2
 *
 * 3 4 1 2 5
 *
 * 바구니 1 2 3 4 5
 *      2 1 3 4 5
 *      2 1 4 3 5
 *      3 4 1 2 5
 *      3 4 1 2 5
 * */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            while (a < b) {
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
        }
        for(int i=1; i<=n; i++){
            System.out.print(arr[i]+ " ");
        }
        br.close();
    }
}
