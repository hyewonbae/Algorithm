import java.io.*;
import java.util.*;
/**
 * 6
 * 10 20 10 30 20 50
 * 
 * 4
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        int max = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if(arr[i]>arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
