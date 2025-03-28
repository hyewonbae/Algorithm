/**
 * Test Case 1
 * 10 10
 *
 * 9 25
 *
 * Test Case 2
 * 0 30
 *
 * 23 45
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m < 45){
            h--;
            m = 60-(45-m);

            if(h < 0){
                h = 23;
            }
            System.out.println(h+ " "+m);
        } else {
            System.out.println(h+ " "+(m-45));
        }

        br.close();
    }
}
