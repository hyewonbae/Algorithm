/**
 *1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * -1
 *
 * 55
 * */
import java.io.*;
import java.util.*;
public class Main {
    static int total = 0;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == -1) break;
            total += n;
        }
        System.out.println(total);
        sc.close();
    }
}
