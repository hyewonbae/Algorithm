import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+m];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<m;i++){
            arr[n+i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for (int a : arr) {
            sb.append(a).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
