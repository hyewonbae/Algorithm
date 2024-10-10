/**
 * 7 77
 *
 * 7
 * 7(A), 8(연산 1), 9(연산 1), 18(연산 2), 19(연산 1), 38(연산 2), 76(연산 2), 77(연산 1)
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = 0;
        while (a!=k) {
            count++;
            if (k%2==0 && k/2>=a)
                k/=2;
            else
                k--;
        }
        System.out.println(count);
        br.close();

    }
}
