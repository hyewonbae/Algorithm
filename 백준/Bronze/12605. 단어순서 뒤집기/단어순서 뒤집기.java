/**
 * 3
 * this is a test
 * foobar
 * all your base
 *
 * Case #1: test a is this
 * Case #2: foobar
 * Case #3: base your all
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String strArr[] = str.split(" ");

            System.out.print("Case #" + (i + 1) + ": ");
            for (int j = strArr.length - 1; j >= 0; j--) {
                System.out.print(strArr[j] + " ");
            }

            System.out.println();
        }

        br.close();
    }
}
