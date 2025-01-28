import java.io.*;
import java.util.*;

/**
 * 10 5
 * 1 2 3 4 2 5 3 1 1 2
 *
 * 3
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int start = 0;
        int end = 0;
        int sum = 0;

        while (end <= n) {
            if (sum < m) {
                if (end < n) {
                    sum += arr[end];
                }
                end++;
            } else if (sum > m) {
                sum -= arr[start];
                start++;
            } else {
                count++;
                sum -= arr[start];
                start++;
            }
        }

        System.out.println(count);
        br.close();
    }
}
