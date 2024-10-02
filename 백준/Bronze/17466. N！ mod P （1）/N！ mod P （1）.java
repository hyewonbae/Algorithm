/**
 * 4 7
 *
 * 3
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long n = Long.parseLong(st.nextToken());
        long p = Long.parseLong(st.nextToken());
        long x = 1;
        for(int i=2; i<=n;i++){
            x = (x*i)%p;
        }
        System.out.println(x%p);
        br.close();
    }
}
