/**
 * 5
 * 1 1
 * 2 3
 * 3 4
 * 9 8
 * 5 2
 * 
 * Case #1: 2
 * Case #2: 5
 * Case #3: 7
 * Case #4: 17
 * Case #5: 7
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = a+b;
            System.out.println("Case #"+(i+1)+": " + c);
        }
        br.close();
    }
}
