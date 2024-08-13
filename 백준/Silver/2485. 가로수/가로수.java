
/**
 * 4
 * 1
 * 3
 * 7
 * 13
 *
 * 3
 * */
import java.io.*;
import java.util.*;

public class Main {

    static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }
        return gcd(b , a % b);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
//        System.out.println(Arrays.toString(arr));

        // 1 3 7 13
        // 2 4 6 -> 최대공약수 2
        // 1 3 5 7 9 11 13

        // 2 6 12 18
        // 4 6 6 -> 최대공약수 2
        // 2 4 6 8 10 12 14 16 18


        // 최대공약수 간격으로 심어야함

        int [] arr_dist = new int[n-1];

        for (int i=1;i<n;i++){
            arr_dist[i-1] = arr[i]-arr[i-1];
        }

//        System.out.println(Arrays.toString(arr_dist));
        int result = arr_dist[0];
        for(int i=1;i<arr_dist.length;i++){
            result = gcd(result,arr_dist[i]);
        }

        int new_cnt = 0;
        for (int dist : arr_dist) {
            new_cnt += (dist / result) - 1;
        }
        System.out.println(new_cnt);
    }
}
