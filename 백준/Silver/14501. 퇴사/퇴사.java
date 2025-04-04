import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
//        for(int i = n-1; i >= 0; i--){
//            if(i+t[i] <= n){
//                dp[i] = Math.max(dp[i+1], p[i]+dp[i+t[i]]);
//            } else {
//                dp[i] = dp[i+1];
//            }
//        }
//        System.out.println(dp[0]);

        for(int i = 0; i < n; i++){
            dp[i+1] = Math.max(dp[i+1], dp[i]);
            if(i+t[i] <= n){
                dp[i+t[i]] = Math.max(dp[i+t[i]], dp[i] + p[i]);
            }
        }
        System.out.println(dp[n]);
    }
}
