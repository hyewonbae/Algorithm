/**
 * Test Case 1
 * 19
 * 1
 * 
 * 1
 * 
 * Test case 2
 * 3
 * 4
 * 
 * 0
 * */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        if(m*7 + n <= 30){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        br.close();
    }
}
