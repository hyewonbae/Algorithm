/**
 * 10 5
 * 1 10 4 9 2 3 8 5 7 6
 *
 * 1 4 2 3
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a<x){
                sb.append(a).append(" ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
