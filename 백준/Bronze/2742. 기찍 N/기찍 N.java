/**
 * 5
 *
 * 5
 * 4
 * 3
 * 2
 * 1
 * */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
        br.close();
    }
}
