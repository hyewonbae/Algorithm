/**
 * Test Case 1
 * 260000
 * 4
 * 20000 5
 * 30000 2
 * 10000 6
 * 5000 8
 *
 * Yes
 *
 * Test Case 2
 * 250000
 * 4
 * 20000 5
 * 30000 2
 * 10000 6
 * 5000 8
 *
 * No
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int price = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            result += price*k;
        }
        if(total == result){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
