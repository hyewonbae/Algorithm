import java.io.*;
import java.util.*;
/**
 * 10 2
 * 3 -2 -4 -9 0 3 7 13 8 -3
 * 
 * 21
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] days = new int[n];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            days[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += days[i];
        }

        int maxSum = sum;

        for(int i = m; i<n; i++){
            sum += days[i] - days[i-m];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
