/**
 * Test case1
 * 2
 *
 * 1666
 * Test case 2
 * 500
 *
 * 166699
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 666;
        int count = 1;

        while(count != n) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}
