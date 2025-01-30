import java.io.*;
import java.util.*;
/**
 * 25 7 5
 * 
 * 2
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int res = 0;
        for (int i = 0; i < n; i++) {
            a = (a % b) * 10;
            res = a / b;
        }
        System.out.println(res);
        br.close();
    }
}
