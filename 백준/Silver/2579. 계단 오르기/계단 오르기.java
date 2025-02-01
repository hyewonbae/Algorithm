import java.io.*;
/**
 * 6
 * 10
 * 20
 * 15
 * 25
 * 10
 * 20
 * 
 * 75
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];

        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-2],dp[i-3] + arr[i-1]) + arr[i];
        }
        System.out.println(dp[n]);
    }
}
