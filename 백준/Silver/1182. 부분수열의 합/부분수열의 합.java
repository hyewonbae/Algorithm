import java.io.*;
import java.util.*;
public class Main {
    static int n;
    static int s;
    static int[] arr;
    static int result = 0;
    static void dfs(int depth, int sum){
        if(depth == n){
            if(sum == s){
                result ++;
            }
            return;
        }

        dfs(depth+1, sum+arr[depth]);
        dfs(depth+1, sum);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0);

        if(s==0){
            result--;
        }

        System.out.println(result);
        br.close();
    }
}
