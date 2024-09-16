/**
 * 3 1
 * 4 5 2
 *
 * 2
 * 4
 * 5
 * */
import java.io.*;
import java.util.*;
public class Main {
    static int n,m;
    static int[] arr;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    static void perm(int cnt, int start){
        if(cnt == m){
            for(int i = 0; i < m; i++){
                sb.append(result[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i < n; i++){
            result[cnt] = arr[i];
            perm(cnt + 1, i);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        result = new int[m];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        perm(0,0);
        System.out.println(sb);
    }
}
