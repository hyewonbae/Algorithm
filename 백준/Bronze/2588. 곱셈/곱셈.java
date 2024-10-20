/**
 * 472
 * 385
 *
 * 2360
 * 3776
 * 1416
 * 181720
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        System.out.println(n*(m%10));
        System.out.println(n*(m%100/10));
        System.out.println(n*(m/100));
        System.out.println(n*m);

        br.close();

    }
}
